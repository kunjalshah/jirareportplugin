package com.dtcc.jira.plugins.servlet.dao;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dtcc.jira.plugins.servlet.dto.ProjectInfo;
import com.opencsv.CSVReader;

public class CSVProjectToServiceMapping implements ProjectToServiceMapping {

    private final static List<ProjectInfo> allProjectList = new ArrayList<ProjectInfo>();

    private final static Map<String, List<ProjectInfo>> serviceProjectMapping = Collections
	    .unmodifiableMap(initializeMapping());

    private static final int EXCEL_PROJECT_NAME_COLUMN = 1;
    private static final int EXCEL_SERVICE_END_COLUMN = 63;
    private static final int EXCEL_SERVICE_START_COLUMN = 12;

    private static final Logger log = LoggerFactory.getLogger(CSVProjectToServiceMapping.class);

    @Override
    public List<ProjectInfo> getProjectListByService(String serviceName) {
	if (serviceProjectMapping == null || serviceProjectMapping.isEmpty()) {
	    initializeMapping();
	}
	return serviceProjectMapping.get(serviceName);
    }

    private static Map<String, List<ProjectInfo>> initializeMapping() {
	Map<String, List<ProjectInfo>> serviceNameToProjectListMap = new HashMap<String, List<ProjectInfo>>();

	CSVReader reader = new CSVReader(new InputStreamReader(
		CSVProjectToServiceMapping.class.getResourceAsStream("/csv/project_service_mapping.csv")));

	String[] nextLine;
	List<String> serviceNames = new ArrayList<String>();

	try {
	    String[] headerNames = reader.readNext();

	    // Create a service names list from the first row (header) of the csv file
	    for (int count = 0; count < headerNames.length; count++) {
		if (count >= EXCEL_SERVICE_START_COLUMN && count <= EXCEL_SERVICE_END_COLUMN) {
		    serviceNames.add(StringUtils.trim(headerNames[count]));
		}
	    }

	    while ((nextLine = reader.readNext()) != null) {
		// nextLine[] is an array of column values from the line

		// Check if "project name" column is not empty/null
		if (StringUtils.isNotEmpty(nextLine[EXCEL_PROJECT_NAME_COLUMN])) {

		    ProjectInfo projectInfo = new ProjectInfo(nextLine[0], nextLine[EXCEL_PROJECT_NAME_COLUMN],
			    nextLine[2]);
		    allProjectList.add(projectInfo);

		    // iterate over all the AWS service columns (12-63) in the CSV row
		    for (int position = EXCEL_SERVICE_START_COLUMN, position2 = 0; position <= EXCEL_SERVICE_END_COLUMN; position++, position2++) {
			// if a service is consumed its a checkmark (value = 1) in the csv file
			if (StringUtils.equalsIgnoreCase(nextLine[position], "1")) {
			    // add project info - first 3 columns to the list of projects for service
			    List<ProjectInfo> projectList = serviceNameToProjectListMap
				    .get(serviceNames.get(position2));

			    if (projectList == null) {
				projectList = new ArrayList<ProjectInfo>();
			    }
			    projectList.add(projectInfo);
			    // Add the updated project list to the service name --> project info map
			    serviceNameToProjectListMap.put(serviceNames.get(position2), projectList);
			}
		    }
		}
	    }
	    reader.close();

	} catch (IOException e) {
	    log.error("Error reading Project to Service Mapping from CSV file" + e.getCause());
	}
	return serviceNameToProjectListMap;
    }

    @Override
    public List<ProjectInfo> getAllProjectList() {
	if (allProjectList == null || allProjectList.isEmpty()) {
	    initializeMapping();
	}
	return allProjectList;
    }
}

package com.dtcc.jira.plugins.servlet.dao;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.dtcc.jira.plugins.servlet.dto.ProjectInfo;
import com.opencsv.CSVReader;

public class CSVProjectToServiceMapping implements ProjectToServiceMapping {

    private final static Map<String, List<ProjectInfo>> serviceProjectMapping = Collections
	    .unmodifiableMap(initializeMapping());

    @Override
    public List<ProjectInfo> getProjectListByService(String serviceName) {
	if (serviceProjectMapping == null) {
	    initializeMapping();
	}
	return serviceProjectMapping.get(serviceName);
    }

    private static Map<String, List<ProjectInfo>> initializeMapping() {
	Map<String, List<ProjectInfo>> mapping = new HashMap<String, List<ProjectInfo>>();

	CSVReader reader = new CSVReader(new InputStreamReader(
		CSVProjectToServiceMapping.class.getResourceAsStream("/csv/project_service_mapping.csv")));

	String[] nextLine;
	List<String> serviceNames = new ArrayList<String>();

	try {
	    String[] headerNames = reader.readNext();
	    // List<List<ProjectInfo>> projects = new ArrayList<List<ProjectInfo>>();

	    for (int count = 0; count < headerNames.length; count++) {
		if (count >= 12 && count <= 63) {
		    serviceNames.add(StringUtils.trim(headerNames[count]));
		}
	    }

	    while ((nextLine = reader.readNext()) != null) {
		// nextLine[] is an array of values from the line
		System.out.println(nextLine[0] + nextLine[1] + "etc...");

		// Check if project name column is not empty/null
		if (StringUtils.isNotEmpty(nextLine[1])) {
		    // iterate over all the AWS service columns in the CSV row
		    for (int position = 12, position2 = 0; position <= 63; position++, position2++) {
			// if a service is consumed its a checkmark (value = 1) in the csv file
			if (StringUtils.equalsIgnoreCase(nextLine[position], "1")) {
			    // add project - nextLine[1] to the list of projects for service at "position"
			    // List<ProjectInfo> projectList = projects.get(position);
			    // projectList.add(new ProjectInfo(nextLine[1]));

			    List<ProjectInfo> projectList = mapping.get(serviceNames.get(position2));

			    if (projectList == null) {
				projectList = new ArrayList<ProjectInfo>();
			    }
			    projectList.add(new ProjectInfo(nextLine[1]));
			    mapping.put(serviceNames.get(position2), projectList);

			}
		    }

		}
	    }

	    // for (int position = 0; position < serviceNames.size(); position++) {
	    // mapping.put(serviceNames.get(position), projects.get(position));
	    // }

	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return mapping;
    }

}

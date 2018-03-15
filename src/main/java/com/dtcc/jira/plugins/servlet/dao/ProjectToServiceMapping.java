package com.dtcc.jira.plugins.servlet.dao;

import java.util.List;

import com.dtcc.jira.plugins.servlet.dto.ProjectInfo;

/**
 * Generic interface to get the Project to Service mapping.
 * 
 * @author kunjal.shah
 *
 */
public interface ProjectToServiceMapping {

    /**
     * Gets a list of Projects that a passed in Service is utilized in.
     * 
     * @param serviceName
     * @return
     */
    List<ProjectInfo> getProjectListByService(String serviceName);

}

package com.dtcc.jira.plugins.servlet.dao;

import java.util.List;

import com.dtcc.jira.plugins.servlet.dto.ProjectInfo;

public interface ProjectToServiceMapping {

    List<ProjectInfo> getProjectListByService(String serviceName);

}

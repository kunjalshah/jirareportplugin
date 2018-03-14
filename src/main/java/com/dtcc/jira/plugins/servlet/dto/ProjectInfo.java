package com.dtcc.jira.plugins.servlet.dto;

public class ProjectInfo {

    private String projectId;
    private String projectName;
    private String projectContact;

    public ProjectInfo(String projectName) {
	this.projectName = projectName;
    }

    public String getProjectId() {
	return projectId;
    }

    public void setProjectId(String projectId) {
	this.projectId = projectId;
    }

    public String getProjectName() {
	return projectName;
    }

    public void setProjectName(String projectName) {
	this.projectName = projectName;
    }

    public String getProjectContact() {
	return projectContact;
    }

    public void setProjectContact(String projectContact) {
	this.projectContact = projectContact;
    }
}

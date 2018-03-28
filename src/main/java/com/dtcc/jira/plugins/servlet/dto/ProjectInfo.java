package com.dtcc.jira.plugins.servlet.dto;

public class ProjectInfo {

    private String projectId;
    private String projectName;
    private String projectContact;
    private String bcmTier;

    public ProjectInfo(String projectId, String projectName, String projectContact, String bcmTier) {
	this.projectName = projectName;
	this.projectId = projectId;
	this.projectContact = projectContact;
	this.bcmTier = bcmTier;
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

    public String getBcmTier() {
	return bcmTier;
    }

    public void setBcmTier(String bcmTier) {
	this.bcmTier = bcmTier;
    }
}

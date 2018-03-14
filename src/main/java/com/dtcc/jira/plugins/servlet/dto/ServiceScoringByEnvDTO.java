package com.dtcc.jira.plugins.servlet.dto;

import java.util.List;

public class ServiceScoringByEnvDTO {

    private String serviceName;
    private String serviceOwner;
    private String lowDevScore;
    private String devScore;
    private String fqaScore;
    private String pqaScore;
    private String pseScore;
    private String prodScore;
    private String plannedMigrationDateLowDev;
    private String plannedMigrationDateDev;
    private String plannedMigrationDateFqa;
    private String plannedMigrationDatePqa;
    private String plannedMigrationDatePse;
    private String plannedMigrationDateProd;
    private String actualMigrationDate;
    private String serviceScoredDate;

    private List<ProjectInfo> projectsUsingService;

    public String getPlannedMigrationDateDev() {
	return plannedMigrationDateDev;
    }

    public void setPlannedMigrationDateDev(String plannedMigrationDateDev) {
	this.plannedMigrationDateDev = plannedMigrationDateDev;
    }

    public String getPlannedMigrationDateFqa() {
	return plannedMigrationDateFqa;
    }

    public void setPlannedMigrationDateFqa(String plannedMigrationDateFqa) {
	this.plannedMigrationDateFqa = plannedMigrationDateFqa;
    }

    public String getPlannedMigrationDatePqa() {
	return plannedMigrationDatePqa;
    }

    public void setPlannedMigrationDatePqa(String plannedMigrationDatePqa) {
	this.plannedMigrationDatePqa = plannedMigrationDatePqa;
    }

    public String getPlannedMigrationDatePse() {
	return plannedMigrationDatePse;
    }

    public void setPlannedMigrationDatePse(String plannedMigrationDatePse) {
	this.plannedMigrationDatePse = plannedMigrationDatePse;
    }

    public String getPlannedMigrationDateProd() {
	return plannedMigrationDateProd;
    }

    public void setPlannedMigrationDateProd(String plannedMigrationDateProd) {
	this.plannedMigrationDateProd = plannedMigrationDateProd;
    }

    public String getServiceName() {
	return serviceName;
    }

    public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
    }

    public String getLowDevScore() {
	return lowDevScore;
    }

    public void setLowDevScore(String lowDevScore) {
	this.lowDevScore = lowDevScore;
    }

    public String getDevScore() {
	return devScore;
    }

    public void setDevScore(String devScore) {
	this.devScore = devScore;
    }

    public String getFqaScore() {
	return fqaScore;
    }

    public void setFqaScore(String fqaScore) {
	this.fqaScore = fqaScore;
    }

    public String getPqaScore() {
	return pqaScore;
    }

    public void setPqaScore(String pqaScore) {
	this.pqaScore = pqaScore;
    }

    public String getPseScore() {
	return pseScore;
    }

    public void setPseScore(String pseScore) {
	this.pseScore = pseScore;
    }

    public String getProdScore() {
	return prodScore;
    }

    public void setProdScore(String prodScore) {
	this.prodScore = prodScore;
    }

    public String getPlannedMigrationDateLowDev() {
	return plannedMigrationDateLowDev;
    }

    public void setPlannedMigrationDateLowDev(String plannedMigrationDateLowDev) {
	this.plannedMigrationDateLowDev = plannedMigrationDateLowDev;
    }

    public String getActualMigrationDate() {
	return actualMigrationDate;
    }

    public void setActualMigrationDate(String actualMigrationDate) {
	this.actualMigrationDate = actualMigrationDate;
    }

    public String getServiceScoredDate() {
	return serviceScoredDate;
    }

    public void setServiceScoredDate(String serviceScoredDate) {
	this.serviceScoredDate = serviceScoredDate;
    }

    public String getServiceOwner() {
	return serviceOwner;
    }

    public void setServiceOwner(String serviceOwner) {
	this.serviceOwner = serviceOwner;
    }

    public List<ProjectInfo> getProjectsUsingService() {
	return projectsUsingService;
    }

    public void setProjectsUsingService(List<ProjectInfo> projectList) {
	this.projectsUsingService = projectList;
    }

    @Override
    public String toString() {
	return "ServiceScoringByEnvDTO [serviceName=" + serviceName + ", serviceOwner=" + serviceOwner
		+ ", lowDevScore=" + lowDevScore + ", devScore=" + devScore + ", fqaScore=" + fqaScore + ", pqaScore="
		+ pqaScore + ", pseScore=" + pseScore + ", prodScore=" + prodScore + ", plannedMigrationDateLowDev="
		+ plannedMigrationDateLowDev + ", plannedMigrationDateDev=" + plannedMigrationDateDev
		+ ", plannedMigrationDateFqa=" + plannedMigrationDateFqa + ", plannedMigrationDatePqa="
		+ plannedMigrationDatePqa + ", plannedMigrationDatePse=" + plannedMigrationDatePse
		+ ", plannedMigrationDateProd=" + plannedMigrationDateProd + ", actualMigrationDate="
		+ actualMigrationDate + ", serviceScoredDate=" + serviceScoredDate + "]";
    }

}

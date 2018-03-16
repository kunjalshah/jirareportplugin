package com.dtcc.jira.plugins.servlet;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.atlassian.jira.bc.issue.search.SearchService;
import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.jira.issue.CustomFieldManager;
import com.atlassian.jira.issue.Issue;
import com.atlassian.jira.issue.fields.CustomField;
import com.atlassian.jira.issue.fields.config.FieldConfig;
import com.atlassian.jira.issue.search.SearchException;
import com.atlassian.jira.jql.builder.JqlClauseBuilder;
import com.atlassian.jira.jql.builder.JqlQueryBuilder;
import com.atlassian.jira.user.ApplicationUser;
import com.atlassian.jira.web.bean.PagerFilter;
import com.atlassian.templaterenderer.TemplateRenderer;
import com.atlassian.webresource.api.assembler.PageBuilderService;
import com.dtcc.jira.plugins.servlet.dao.CSVProjectToServiceMapping;
import com.dtcc.jira.plugins.servlet.dao.ProjectToServiceMapping;
import com.dtcc.jira.plugins.servlet.dto.ProjectInfo;
import com.dtcc.jira.plugins.servlet.dto.ServiceScoringByEnvDTO;
import com.google.common.collect.Maps;

/**
 * JIRA Plugin Servlet that is responsible for the Service Scoring Dashboard
 * view.
 * 
 * @author kunjal.shah
 *
 */
public class ServiceScoringDashboard extends HttpServlet {

    private static final long serialVersionUID = 2697899894973274006L;
    private static final Logger log = LoggerFactory.getLogger(ServiceScoringDashboard.class);
    private SearchService searchService;
    private TemplateRenderer renderer;
    private PageBuilderService pageBuilderService;
    private final CustomFieldManager customFieldManager;

    private static final String LIST_BROWSER_TEMPLATE = "/templates/list.vm";

    /**
     * Servlet constructor that is auto-wired by Spring to include the following
     * services registered in the params.
     *
     * @param searchService
     * @param customFieldManager
     * @param templateRenderer
     * @param pageBuilderService
     */
    public ServiceScoringDashboard(SearchService searchService, CustomFieldManager customFieldManager,
	    TemplateRenderer templateRenderer, PageBuilderService pageBuilderService) {
	this.searchService = searchService;
	this.renderer = templateRenderer;
	this.customFieldManager = customFieldManager;
	this.pageBuilderService = pageBuilderService;

    }

    /**
     * GET method for servlet handles showing a list of Services and related Service
     * Score by Environment
     * 
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	List<Issue> issues = getIssues(req);
	List<ServiceScoringByEnvDTO> services = new ArrayList<ServiceScoringByEnvDTO>();
	for (int count = 0; count < issues.size(); count++) {
	    ServiceScoringByEnvDTO service = new ServiceScoringByEnvDTO();
	    CustomField actualMigrationDate = getCustomFieldByName(issues.get(count), "Actual Migration Date");
	    CustomField serviceScoredDate = getCustomFieldByName(issues.get(count), "Service Scored Date");
	    CustomField plannedMigrationDateLowDev = getCustomFieldByName(issues.get(count),
		    "Planned Migration Date Low Dev");
	    CustomField plannedMigrationDateDev = getCustomFieldByName(issues.get(count), "Planned Migration Date DEV");
	    CustomField plannedMigrationDateFqa = getCustomFieldByName(issues.get(count), "Planned Migration Date FQA");
	    CustomField plannedMigrationDatePqa = getCustomFieldByName(issues.get(count), "Planned Migration Date PQA");
	    CustomField plannedMigrationDatePse = getCustomFieldByName(issues.get(count), "Planned Migration Date PSE");
	    CustomField plannedMigrationDateProd = getCustomFieldByName(issues.get(count),
		    "Planned Migration Date PROD");

	    CustomField lowDevScore = getCustomFieldByName(issues.get(count), "Low Dev Score");
	    CustomField devScore = getCustomFieldByName(issues.get(count), "DEV Score");
	    CustomField fqaScore = getCustomFieldByName(issues.get(count), "FQA Score");
	    CustomField pqaScore = getCustomFieldByName(issues.get(count), "PQA Score");
	    CustomField pseScore = getCustomFieldByName(issues.get(count), "PSE Score");
	    CustomField prodScore = getCustomFieldByName(issues.get(count), "PROD Score");

	    service.setActualMigrationDate((String) (actualMigrationDate == null ? null
		    : formatDate((Timestamp) actualMigrationDate.getValue(issues.get(count)))));

	    service.setServiceScoredDate((String) (serviceScoredDate == null ? null
		    : formatDate((Timestamp) serviceScoredDate.getValue(issues.get(count)))));

	    service.setPlannedMigrationDateLowDev((String) (plannedMigrationDateLowDev == null ? null
		    : formatDate((Timestamp) plannedMigrationDateLowDev.getValue(issues.get(count)))));

	    service.setPlannedMigrationDateDev((String) (plannedMigrationDateDev == null ? null
		    : formatDate((Timestamp) plannedMigrationDateDev.getValue(issues.get(count)))));

	    service.setPlannedMigrationDateFqa((String) (plannedMigrationDateFqa == null ? null
		    : formatDate((Timestamp) plannedMigrationDateFqa.getValue(issues.get(count)))));

	    service.setPlannedMigrationDatePqa((String) (plannedMigrationDatePqa == null ? null
		    : formatDate((Timestamp) plannedMigrationDatePqa.getValue(issues.get(count)))));

	    service.setPlannedMigrationDatePse((String) (plannedMigrationDatePse == null ? null
		    : formatDate((Timestamp) plannedMigrationDatePse.getValue(issues.get(count)))));

	    service.setPlannedMigrationDateProd((String) (plannedMigrationDateProd == null ? null
		    : formatDate((Timestamp) plannedMigrationDateProd.getValue(issues.get(count)))));

	    service.setServiceName(issues.get(count).getSummary());
	    service.setServiceOwner(
		    issues.get(count).getAssignee() != null ? issues.get(count).getAssignee().getDisplayName()
			    : "Unassigned");

	    service.setLowDevScore(lowDevScore == null ? null : lowDevScore.getValue(issues.get(count)).toString());
	    service.setDevScore(devScore == null ? null : devScore.getValue(issues.get(count)).toString());
	    service.setFqaScore(fqaScore == null ? null : fqaScore.getValue(issues.get(count)).toString());
	    service.setPqaScore(pqaScore == null ? null : pqaScore.getValue(issues.get(count)).toString());
	    service.setPseScore(pseScore == null ? null : pseScore.getValue(issues.get(count)).toString());
	    service.setProdScore(prodScore == null ? null : prodScore.getValue(issues.get(count)).toString());

	    services.add(service);
	}

	ProjectToServiceMapping projectServiceMapping = new CSVProjectToServiceMapping();

	for (ServiceScoringByEnvDTO service : services) {
	    List<ProjectInfo> projectList = projectServiceMapping.getProjectListByService(service.getServiceName());
	    service.setProjectsUsingService(projectList);
	}

	Map<String, Object> context = Maps.newHashMap();
	context.put("services", services);
	context.put("projects", projectServiceMapping.getAllProjectList());
	context.put("todaysDate", new SimpleDateFormat("MMM dd YYYY").format(new Date()));
	resp.setContentType("text/html;charset=utf-8");
	pageBuilderService.assembler().resources()
		.requireWebResource("com.dtcc.jira.plugins.servlet.ServicesScoringDashboard:ui-resources")
		.requireWebResource("com.atlassian.auiplugin:aui-experimental-tooltips");

	// Pass in the list of issues as the context
	renderer.render(LIST_BROWSER_TEMPLATE, context, resp.getWriter());

    }

    private String formatDate(Timestamp timeStamp) {
	Date date = new Date();
	if (timeStamp != null) {
	    date.setTime(timeStamp.getTime());
	    return new SimpleDateFormat("MMM dd YYYY").format(date);
	}
	return null;
    }

    private CustomField getCustomFieldByName(final Issue issue, final String name) {
	if (name == null || issue == null) {// Something is wrong here, we don't care
	    return null;
	}

	Collection<CustomField> fields = customFieldManager.getCustomFieldObjectsByName(name);

	if (fields == null) {// No field present, OK.
	    return null;
	}

	for (CustomField field : fields) {
	    if (field.getRelevantConfig(issue) != null) {
		return field;
	    }
	    FieldConfig config = field.getRelevantConfig(issue);
	    if (config != null) {
		return field;
	    }
	}

	return null;
    }

    /**
     * Returns a list of issues used to populate the list.vm template in the GET
     * request
     *
     * @param req
     * @return
     */
    private List<Issue> getIssues(HttpServletRequest req) {
	// User is required to carry out a search
	ApplicationUser user = getCurrentUser(req);

	// search issues

	// The search interface requires JQL clause... so let's build one
	JqlClauseBuilder jqlClauseBuilder = JqlQueryBuilder.newClauseBuilder();
	// Our JQL clause is simple issueType="Service"
	com.atlassian.query.Query query = jqlClauseBuilder.issueType("Service").buildQuery();
	// A page filter is used to provide pagination. Let's use an unlimited
	// filter to
	// to bypass pagination.
	PagerFilter pagerFilter = PagerFilter.getUnlimitedFilter();
	com.atlassian.jira.issue.search.SearchResults searchResults = null;
	try {
	    // Perform search results
	    searchResults = searchService.search(user, query, pagerFilter);
	} catch (SearchException e) {
	    log.error("Error performing search in getting all Service Issues. " + e.getCause());
	}
	// return the results
	return searchResults.getIssues();
    }

    /**
     * Helper method for getting the current user
     *
     * @param req
     * @return
     */
    private ApplicationUser getCurrentUser(HttpServletRequest req) {
	return ComponentAccessor.getJiraAuthenticationContext().getLoggedInUser();
    }
}
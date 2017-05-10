package org.mvc.duketrackerissue.web;

import org.mvc.duketrackerissue.service.DukeTrackerIssueService;

import javax.inject.Inject;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by JCARE on 10/05/2017.
 */
@Controller
@Path("/issues")
public class IssuesController {

    @Inject
    private DukeTrackerIssueService dukeTrackerIssueService;

    @Inject
    private IssuesBean issuesBean;

    @GET
    public String displayIssues() {
        // To make available via Models, use the following:
        //models.put("dukeIssues", dukeIssueTrackerService.getIssueList());

        // To make available via CDI, use the IssuesBean:
        issuesBean.setIssueList(dukeTrackerIssueService.getIssueList());
        return "issues.xhtml";
    }
}

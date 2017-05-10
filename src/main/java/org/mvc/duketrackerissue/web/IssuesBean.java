package org.mvc.duketrackerissue.web;

import org.mvc.duketrackerissue.rest.DukeIssues;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.List;

/**
 * Created by JCARE on 10/05/2017.
 */
@Named
@RequestScoped
public class IssuesBean {

    private Issue issue;
    private String message;
    private List<DukeIssues> issueList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the issueList
     */
    public List<DukeIssues> getIssueList() {
        return issueList;
    }

    /**
     * @param issueList the issueList to set
     */
    public void setIssueList(
            List<DukeIssues> issueList) {
        this.issueList = issueList;
    }

    /**
     * @return the issue
     */
    public Issue getIssue() {
        if (issue == null) {
            issue = new Issue();
        }
        return issue;
    }

    /**
     * @param issue the issue to set
     */
    public void setIssue(Issue issue) {
        this.issue = issue;
    }
}

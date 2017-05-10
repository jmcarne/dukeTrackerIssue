package org.mvc.duketrackerissue.service;

import org.mvc.duketrackerissue.rest.DukeIssues;

import javax.annotation.PostConstruct;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by JCARE on 10/05/2017.
 */
public class DukeTrackerIssueService {
    private Client jaxRsClient;
    private List<DukeIssues> issueList;

    private String hostUri =
            "http://localhost:8080/DukeIssueTracker/tracker";

    public DukeTrackerIssueService() {

    }

    @PostConstruct
    public void init() {
        System.out.println("initializing app...");
        // Construct a JAX-RS Client
        setJaxRsClient(ClientBuilder.newClient());
        loadData();
    }

    private void loadData() {
        System.out.println("loading issues...");
        issueList = getJaxRsClient()
                .target(getHostUri() +
                        "/org.mvc.dukeissuetracker.rest.dukeissues")
                .request("application/xml")
                .get(new GenericType<List<DukeIssues>>() {
                     }
                );
        System.out.println("Issues after load:" +
                issueList.size());
    }

    /**
     * Returns a <code>DukeIssues</code> object matching the requested ID.
     *
     * @param id
     * @return
     */
    public DukeIssues findById(BigDecimal id) {
        return (DukeIssues) getJaxRsClient()
                .target(getHostUri() +
                        "/org.mvc.dukeissuetracker.rest.dukeissues/" + id)
                .request("application/xml")
                .get(new GenericType<DukeIssues>() {

                });
    }


    /**
     * @return the issueList
     */
    public List<DukeIssues> getIssueList() {
        // Load fresh data
        loadData();

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
     * @return the jaxRsClient
     */
    public Client getJaxRsClient() {
        return jaxRsClient;
    }

    /**
     * @param jaxRsClient the jaxRsClient to set
     */
    public void setJaxRsClient(Client jaxRsClient) {
        this.jaxRsClient = jaxRsClient;
    }

    /**
     * @return the hostUri
     */
    public String getHostUri() {
        return hostUri;
    }

    /**
     * @param hostUri the hostUri to set
     */
    public void setHostUri(String hostUri) {
        this.hostUri = hostUri;
    }


}

package org.mvc.duketrackerissue.web;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import java.math.BigDecimal;

/**
 * Created by JCARE on 10/05/2017.
 */
public class Issue {
    @FormParam(value = "id")
    private BigDecimal id;

    @FormParam(value = "status")
    private Long status;

    @FormParam(value = "priority")
    private Long priority;

    @NotNull
    @FormParam(value = "requestorFirstName")
    private String requestorFirstName;

    @NotNull
    @FormParam(value = "requestorLastName")
    private String requestorLastName;

    @NotNull
    @FormParam(value = "requestorEmail")
    private String requestorEmail;

    @Size(max = 150)
    @FormParam(value = "subject")
    private String subject;

    @Size(max = 2000)
    @FormParam(value = "description")
    private String description;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public String getRequestorFirstName() {
        return requestorFirstName;
    }

    public void setRequestorFirstName(String requestorFirstName) {
        this.requestorFirstName = requestorFirstName;
    }

    public String getRequestorLastName() {
        return requestorLastName;
    }

    public void setRequestorLastName(String requestorLastName) {
        this.requestorLastName = requestorLastName;
    }

    public String getRequestorEmail() {
        return requestorEmail;
    }

    public void setRequestorEmail(String requestorEmail) {
        this.requestorEmail = requestorEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

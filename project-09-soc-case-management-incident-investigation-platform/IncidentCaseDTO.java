package com.alhanoof.soc.dto;

public class IncidentCaseDTO {

    private Long caseId;
    private String incidentType;
    private String severity;
    private String assignedAnalyst;
    private String status;

    public IncidentCaseDTO(
            Long caseId,
            String incidentType,
            String severity,
            String assignedAnalyst,
            String status) {

        this.caseId = caseId;
        this.incidentType = incidentType;
        this.severity = severity;
        this.assignedAnalyst = assignedAnalyst;
        this.status = status;
    }

    public Long getCaseId() {
        return caseId;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public String getSeverity() {
        return severity;
    }

    public String getAssignedAnalyst() {
        return assignedAnalyst;
    }

    public String getStatus() {
        return status;
    }
}

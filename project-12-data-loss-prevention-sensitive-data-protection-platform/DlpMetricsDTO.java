package com.alhanoof.dlp.dto;

public class DlpMetricsDTO {

    private int sensitiveFiles;
    private int dlpViolations;
    private int dataExposureEvents;
    private int highRiskUsers;
    private String status;

    public DlpMetricsDTO(
            int sensitiveFiles,
            int dlpViolations,
            int dataExposureEvents,
            int highRiskUsers,
            String status) {

        this.sensitiveFiles = sensitiveFiles;
        this.dlpViolations = dlpViolations;
        this.dataExposureEvents = dataExposureEvents;
        this.highRiskUsers = highRiskUsers;
        this.status = status;
    }

    public int getSensitiveFiles() {
        return sensitiveFiles;
    }

    public int getDlpViolations() {
        return dlpViolations;
    }

    public int getDataExposureEvents() {
        return dataExposureEvents;
    }

    public int getHighRiskUsers() {
        return highRiskUsers;
    }

    public String getStatus() {
        return status;
    }
}

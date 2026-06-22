package com.alhanoof.loganalytics.dto;

public class LogStatisticsDTO {

    private int totalLogs;
    private int errorLogs;
    private int warningLogs;
    private int infoLogs;
    private String status;

    public LogStatisticsDTO(
            int totalLogs,
            int errorLogs,
            int warningLogs,
            int infoLogs,
            String status) {

        this.totalLogs = totalLogs;
        this.errorLogs = errorLogs;
        this.warningLogs = warningLogs;
        this.infoLogs = infoLogs;
        this.status = status;
    }

    public int getTotalLogs() {
        return totalLogs;
    }

    public int getErrorLogs() {
        return errorLogs;
    }

    public int getWarningLogs() {
        return warningLogs;
    }

    public int getInfoLogs() {
        return infoLogs;
    }

    public String getStatus() {
        return status;
    }
}

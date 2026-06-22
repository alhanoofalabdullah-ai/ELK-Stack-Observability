package com.alhanoof.iam.dto;

public class IamMetricsDTO {

    private int activeUsers;
    private int privilegedAccounts;
    private int failedLogins;
    private int accessViolations;
    private String status;

    public IamMetricsDTO(
            int activeUsers,
            int privilegedAccounts,
            int failedLogins,
            int accessViolations,
            String status) {

        this.activeUsers = activeUsers;
        this.privilegedAccounts = privilegedAccounts;
        this.failedLogins = failedLogins;
        this.accessViolations = accessViolations;
        this.status = status;
    }

    public int getActiveUsers() {
        return activeUsers;
    }

    public int getPrivilegedAccounts() {
        return privilegedAccounts;
    }

    public int getFailedLogins() {
        return failedLogins;
    }

    public int getAccessViolations() {
        return accessViolations;
    }

    public String getStatus() {
        return status;
    }
}

package com.alhanoof.devsecops.dto;

public class DevSecOpsMetricsDTO {

    private long buildsProcessed;
    private int securityFindings;
    private int criticalVulnerabilities;
    private long successfulDeployments;
    private String status;

    public DevSecOpsMetricsDTO(
            long buildsProcessed,
            int securityFindings,
            int criticalVulnerabilities,
            long successfulDeployments,
            String status) {

        this.buildsProcessed = buildsProcessed;
        this.securityFindings = securityFindings;
        this.criticalVulnerabilities = criticalVulnerabilities;
        this.successfulDeployments = successfulDeployments;
        this.status = status;
    }

    public long getBuildsProcessed() {
        return buildsProcessed;
    }

    public int getSecurityFindings() {
        return securityFindings;
    }

    public int getCriticalVulnerabilities() {
        return criticalVulnerabilities;
    }

    public long getSuccessfulDeployments() {
        return successfulDeployments;
    }

    public String getStatus() {
        return status;
    }
}

package com.alhanoof.compliance.dto;

public class ComplianceMetricsDTO {

    private int totalControls;
    private int compliantControls;
    private int violations;
    private int highRiskFindings;
    private String status;

    public ComplianceMetricsDTO(
            int totalControls,
            int compliantControls,
            int violations,
            int highRiskFindings,
            String status) {

        this.totalControls = totalControls;
        this.compliantControls = compliantControls;
        this.violations = violations;
        this.highRiskFindings = highRiskFindings;
        this.status = status;
    }

    public int getTotalControls() {
        return totalControls;
    }

    public int getCompliantControls() {
        return compliantControls;
    }

    public int getViolations() {
        return violations;
    }

    public int getHighRiskFindings() {
        return highRiskFindings;
    }

    public String getStatus() {
        return status;
    }
}

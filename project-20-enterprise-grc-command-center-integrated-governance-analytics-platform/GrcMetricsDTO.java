package com.alhanoof.grc.dto;

public class GrcMetricsDTO {

    private int activeRisks;
    private int complianceIssues;
    private int openAuditFindings;
    private int highRiskVendors;
    private int governanceScore;
    private String status;

    public GrcMetricsDTO(
            int activeRisks,
            int complianceIssues,
            int openAuditFindings,
            int highRiskVendors,
            int governanceScore,
            String status) {

        this.activeRisks = activeRisks;
        this.complianceIssues = complianceIssues;
        this.openAuditFindings = openAuditFindings;
        this.highRiskVendors = highRiskVendors;
        this.governanceScore = governanceScore;
        this.status = status;
    }

    public int getActiveRisks() {
        return activeRisks;
    }

    public int getComplianceIssues() {
        return complianceIssues;
    }

    public int getOpenAuditFindings() {
        return openAuditFindings;
    }

    public int getHighRiskVendors() {
        return highRiskVendors;
    }

    public int getGovernanceScore() {
        return governanceScore;
    }

    public String getStatus() {
        return status;
    }
}

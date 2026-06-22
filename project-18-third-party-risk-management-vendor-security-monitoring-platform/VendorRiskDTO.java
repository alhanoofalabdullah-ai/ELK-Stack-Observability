package com.alhanoof.tprm.dto;

public class VendorRiskDTO {

    private int vendorsMonitored;
    private int highRiskVendors;
    private int openFindings;
    private int complianceIssues;
    private String status;

    public VendorRiskDTO(
            int vendorsMonitored,
            int highRiskVendors,
            int openFindings,
            int complianceIssues,
            String status) {

        this.vendorsMonitored = vendorsMonitored;
        this.highRiskVendors = highRiskVendors;
        this.openFindings = openFindings;
        this.complianceIssues = complianceIssues;
        this.status = status;
    }

    public int getVendorsMonitored() {
        return vendorsMonitored;
    }

    public int getHighRiskVendors() {
        return highRiskVendors;
    }

    public int getOpenFindings() {
        return openFindings;
    }

    public int getComplianceIssues() {
        return complianceIssues;
    }

    public String getStatus() {
        return status;
    }
}

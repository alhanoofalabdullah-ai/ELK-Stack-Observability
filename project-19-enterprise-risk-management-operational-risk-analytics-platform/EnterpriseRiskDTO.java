package com.alhanoof.erm.dto;

public class EnterpriseRiskDTO {

    private int activeRisks;
    private int highRisks;
    private int criticalRisks;
    private int controlFailures;
    private String status;

    public EnterpriseRiskDTO(
            int activeRisks,
            int highRisks,
            int criticalRisks,
            int controlFailures,
            String status) {

        this.activeRisks = activeRisks;
        this.highRisks = highRisks;
        this.criticalRisks = criticalRisks;
        this.controlFailures = controlFailures;
        this.status = status;
    }

    public int getActiveRisks() {
        return activeRisks;
    }

    public int getHighRisks() {
        return highRisks;
    }

    public int getCriticalRisks() {
        return criticalRisks;
    }

    public int getControlFailures() {
        return controlFailures;
    }

    public String getStatus() {
        return status;
    }
}

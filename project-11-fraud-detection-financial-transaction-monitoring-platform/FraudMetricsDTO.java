package com.alhanoof.fraud.dto;

public class FraudMetricsDTO {

    private long transactionsProcessed;
    private int fraudAlerts;
    private int highRiskTransactions;
    private int investigationsOpen;
    private String status;

    public FraudMetricsDTO(
            long transactionsProcessed,
            int fraudAlerts,
            int highRiskTransactions,
            int investigationsOpen,
            String status) {

        this.transactionsProcessed = transactionsProcessed;
        this.fraudAlerts = fraudAlerts;
        this.highRiskTransactions = highRiskTransactions;
        this.investigationsOpen = investigationsOpen;
        this.status = status;
    }

    public long getTransactionsProcessed() {
        return transactionsProcessed;
    }

    public int getFraudAlerts() {
        return fraudAlerts;
    }

    public int getHighRiskTransactions() {
        return highRiskTransactions;
    }

    public int getInvestigationsOpen() {
        return investigationsOpen;
    }

    public String getStatus() {
        return status;
    }
}

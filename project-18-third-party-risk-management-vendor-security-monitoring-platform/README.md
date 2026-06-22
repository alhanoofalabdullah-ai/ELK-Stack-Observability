# 🚀 Project 18 – Third-Party Risk Management (TPRM) & Vendor Security Monitoring Platform

## Executive Summary

The Third-Party Risk Management (TPRM) & Vendor Security Monitoring Platform is an enterprise-grade risk management solution designed to assess, monitor, and govern security risks associated with third-party vendors, suppliers, service providers, and strategic partners.

The platform provides centralized visibility into vendor risk exposure, compliance posture, cybersecurity assessments, remediation activities, and ongoing monitoring programs.

Built using Elasticsearch, Logstash, Kibana, Spring Boot, and Docker, the platform supports governance, risk, compliance, procurement, cybersecurity, and audit functions.

---

# Overview

Organizations increasingly depend on third-party providers.

Examples include:

- Cloud Providers
- Software Vendors
- Managed Service Providers
- Outsourcing Partners
- Financial Service Providers
- Logistics Providers
- Consulting Companies

Third-party relationships introduce operational, compliance, and cybersecurity risks that require continuous monitoring.

---

# Business Problem

Organizations commonly face:

- Vendor Security Incidents
- Weak Supplier Controls
- Compliance Violations
- Data Privacy Risks
- Regulatory Requirements
- Vendor Concentration Risks
- Limited Vendor Visibility

Without effective monitoring, third-party risks may significantly impact business operations.

---

# Business Objectives

The platform helps organizations:

- Assess vendor risks
- Monitor security posture
- Track compliance obligations
- Support due diligence reviews
- Improve governance visibility
- Strengthen supplier oversight
- Reduce operational risk

---

# Key Features

## Vendor Risk Assessment

Assess:

- Security Controls
- Compliance Status
- Data Protection Controls
- Operational Resilience
- Cybersecurity Maturity

---

## Vendor Monitoring

Track:

- Open Findings
- Security Incidents
- Compliance Violations
- Risk Score Changes
- Contract Reviews

---

## Risk Scoring

Calculate:

- Vendor Risk Score
- Residual Risk
- Inherent Risk
- Compliance Risk
- Cyber Risk

---

## Compliance Monitoring

Support:

- ISO 27001
- NIST
- GDPR
- PCI DSS
- Vendor Governance Policies

---

## Executive Dashboards

Visualize:

- High-Risk Vendors
- Vendor Risk Trends
- Assessment Status
- Compliance Readiness
- Third-Party Exposure

---

# Enterprise Architecture

Vendor Assessments
        │
        ▼
Vendor Security Events
        │
        ▼
     Logstash
        │
        ▼
  Elasticsearch
        │
        ▼
      Kibana
        │
        ▼
Risk & Compliance Teams

---

# Technology Stack

| Layer | Technology |
|---------|------------|
| Backend | Spring Boot 3 |
| Language | Java 21 |
| Search Engine | Elasticsearch |
| Processing | Logstash |
| Visualization | Kibana |
| Containers | Docker |
| Build Tool | Maven |

---

# REST API

## Get Vendor Risk Metrics

GET /api/vendors/metrics

Response

{
  "vendorsMonitored": 420,
  "highRiskVendors": 18,
  "openFindings": 74,
  "complianceIssues": 11,
  "status": "Monitoring"
}

---

## Create Vendor Assessment

POST /api/vendors/assessment

---

## Generate Vendor Risk Report

GET /api/vendors/report

---

# Risk Metrics

Monitor:

- Vendor Risk Score
- High-Risk Vendors
- Compliance Findings
- Assessment Coverage
- Remediation Progress
- Third-Party Exposure

---

# Use Cases

### Cybersecurity Teams

Assess vendor security posture.

### Risk Management Teams

Monitor third-party risks.

### Procurement Teams

Review supplier assessments.

### Compliance Teams

Track vendor obligations.

### Executive Leadership

Review strategic vendor exposure.

---

# Future Enhancements

- SecurityScorecard Integration
- BitSight Integration
- Shared Assessments SIG
- Continuous Vendor Monitoring
- AI Vendor Risk Analytics
- Regulatory Risk Mapping

---

# Skills Demonstrated

- ELK Stack
- Third-Party Risk Management
- Vendor Governance
- Compliance Monitoring
- Risk Analytics
- Security Assessments
- Spring Boot
- Docker
- Kibana Dashboards
- Enterprise Risk Management

---

# Author

Alhanoof Alabdullah

Enterprise Third-Party Risk Management Portfolio Project

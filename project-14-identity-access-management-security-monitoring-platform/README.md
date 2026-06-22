# 🚀 Project 14 – Identity & Access Management (IAM) Security Monitoring Platform

## Executive Summary

The Identity & Access Management (IAM) Security Monitoring Platform is an enterprise-grade security analytics solution designed to monitor identities, user access rights, privileged accounts, authentication events, and access governance controls.

The platform uses Elasticsearch, Logstash, Kibana, Spring Boot, and Docker to provide centralized visibility into identity-related risks and access management activities.

This project simulates IAM monitoring environments commonly used in banks, government entities, healthcare organizations, and enterprise security operations.

---

# Overview

Identity is the new security perimeter.

Modern organizations must continuously monitor:

- User Accounts
- Privileged Accounts
- Authentication Events
- Access Requests
- Role Assignments
- Segregation of Duties
- Identity Risks

Effective IAM monitoring reduces insider threats and unauthorized access risks.

---

# Business Problem

Organizations commonly face:

- Excessive Privileges
- Dormant Accounts
- Unauthorized Access
- Privileged Abuse
- Identity Governance Gaps
- Access Certification Challenges
- Compliance Violations

Without IAM visibility, security risks remain hidden.

---

# Business Objectives

The platform helps organizations:

- Monitor identity risks
- Detect privileged abuse
- Track authentication activities
- Improve governance controls
- Support compliance initiatives
- Strengthen Zero Trust programs
- Improve access visibility

---

# Key Features

## Authentication Monitoring

Track:

- Successful Logins
- Failed Logins
- MFA Events
- Password Resets
- Account Lockouts

---

## Privileged Access Monitoring

Monitor:

- Admin Activities
- Privileged Sessions
- Elevated Permissions
- Critical System Access

---

## Identity Governance

Track:

- Role Assignments
- Role Changes
- Access Reviews
- User Certifications

---

## Risk Analytics

Analyze:

- Dormant Accounts
- Excessive Permissions
- High-Risk Users
- Privileged Risks

---

## Executive Dashboards

Visualize:

- IAM Risks
- Identity KPIs
- Access Violations
- Governance Metrics
- Compliance Status

---

# Enterprise Architecture

Identity Sources
        │
        ▼
Authentication Events
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
IAM & Security Teams

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

# IAM Metrics

Monitor:

- Active Users
- Failed Logins
- MFA Failures
- Dormant Accounts
- Privileged Users
- Access Violations
- High-Risk Identities

---

# REST API

## Get IAM Metrics

GET /api/iam/metrics

Response:

{
  "activeUsers": 5400,
  "privilegedAccounts": 175,
  "failedLogins": 215,
  "accessViolations": 12,
  "status": "Monitoring"
}

---

## Generate IAM Alert

POST /api/iam/alert

---

## Generate IAM Report

GET /api/iam/report

---

# Compliance Support

Supports monitoring for:

- ISO 27001
- NIST
- SOX
- GDPR
- Zero Trust Framework
- Identity Governance Programs

---

# Use Cases

### IAM Teams

Monitor identities and permissions.

### Security Teams

Detect unauthorized access.

### Compliance Teams

Review governance controls.

### Internal Audit

Assess access controls.

### Executive Leadership

Monitor identity risks.

---

# Future Enhancements

- Azure AD Integration
- Okta Integration
- SailPoint Integration
- CyberArk Integration
- PAM Analytics
- Zero Trust Scoring
- AI Identity Risk Analytics

---

# Skills Demonstrated

- ELK Stack
- IAM Monitoring
- Identity Governance
- Privileged Access Management
- Security Analytics
- Risk Monitoring
- Spring Boot
- Docker
- Kibana Dashboards
- Enterprise Security

---

# Author

Alhanoof Alabdullah

Enterprise IAM & Identity Governance Portfolio Project

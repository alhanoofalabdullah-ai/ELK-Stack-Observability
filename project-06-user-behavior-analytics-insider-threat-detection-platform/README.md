# 🚀 Project 06 – User Behavior Analytics (UBA) & Insider Threat Detection Platform

## Overview

The User Behavior Analytics (UBA) & Insider Threat Detection Platform is an enterprise cybersecurity analytics solution designed to monitor user activities, identify abnormal behaviors, detect insider threats, and provide behavioral risk scoring.

The platform leverages Elasticsearch, Logstash, Kibana, Spring Boot, and Docker to analyze authentication events, user activities, privileged actions, file access patterns, and anomalous behaviors across enterprise environments.

This project demonstrates how Security Operations Centers (SOC), Cybersecurity Teams, Risk Teams, and Governance Departments use behavioral analytics to detect threats originating from legitimate users.

---

# Business Problem

Many security incidents originate from trusted users.

Examples include:

- Insider Threats
- Data Theft
- Privileged Abuse
- Unauthorized Access
- Suspicious File Downloads
- Credential Misuse
- Excessive Data Access

Traditional security controls often fail to identify these threats because users possess valid credentials.

---

# Business Objectives

The platform helps organizations:

- Detect insider threats
- Monitor employee activities
- Identify unusual behaviors
- Reduce data leakage risks
- Improve security visibility
- Support investigations
- Strengthen governance controls

---

# Key Features

## User Activity Monitoring

Monitor:

- Login Events
- Logout Events
- File Access
- Data Downloads
- Administrative Actions
- Privileged Activities

---

## Behavioral Analytics

Analyze:

- User Access Patterns
- Working Hours Deviations
- Geographic Anomalies
- Device Changes
- Unusual Resource Access

---

## Insider Threat Detection

Detect:

- Excessive Data Access
- Suspicious Downloads
- Unauthorized Data Exports
- Privilege Abuse
- Abnormal User Activity

---

## Risk Scoring

Calculate:

- User Risk Score
- Department Risk Score
- Privileged User Risk
- Behavioral Risk Trends

---

## Kibana Dashboards

Visualize:

- High Risk Users
- Activity Trends
- Login Patterns
- Threat Indicators
- User Risk Distribution

---

# Architecture

```text
Enterprise Applications
         │
         ▼
 User Activity Logs
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
   Security Teams
```

---

# Technology Stack

| Layer | Technology |
|---------|------------|
| Backend | Spring Boot |
| Language | Java 21 |
| Search Engine | Elasticsearch |
| Processing | Logstash |
| Visualization | Kibana |
| Containers | Docker |
| Build Tool | Maven |

---

# Risk Scoring Model

| Risk Score | Classification |
|------------|---------------|
| 0–20 | Low Risk |
| 21–50 | Medium Risk |
| 51–80 | High Risk |
| 81–100 | Critical Risk |

---

# REST API

## Get User Behavior Metrics

```http
GET /api/uba/metrics
```

Response:

```json
{
  "activeUsers": 2850,
  "highRiskUsers": 15,
  "criticalAlerts": 4,
  "insiderThreatIndicators": 7,
  "status": "Warning"
}
```

---

## Generate User Activity Event

```http
POST /api/uba/event
```

---

# Monitoring Metrics

Track:

- Active Users
- Failed Logins
- Privileged Actions
- Data Downloads
- High Risk Users
- Insider Threat Indicators
- Behavioral Anomalies

---

# Threat Scenarios

Monitor:

- Login from Unusual Location
- Excessive File Downloads
- Off-Hours Activity
- Multiple Failed Logins
- Privileged Escalation
- Unauthorized Data Access

---

# Installation

```bash
mvn clean package
```

```bash
docker-compose up -d
```

---

# Services

## Elasticsearch

http://localhost:9200

## Kibana

http://localhost:5601

## UBA API

http://localhost:8080

---

# Use Cases

### SOC Teams

Detect suspicious users.

### Cybersecurity Teams

Investigate insider threats.

### Governance Teams

Monitor user accountability.

### Compliance Teams

Review access activities.

### Risk Teams

Assess behavioral risks.

---

# Future Enhancements

- UEBA Machine Learning
- AI Risk Scoring
- Threat Intelligence Integration
- SIEM Integration
- SOAR Integration
- MITRE ATT&CK Mapping

---

# Skills Demonstrated

- ELK Stack
- User Behavior Analytics
- Insider Threat Detection
- Security Monitoring
- Risk Analytics
- Spring Boot
- Java
- Docker
- Kibana Dashboards
- Enterprise Security

---

# Author

Alhanoof Alabdullah

Enterprise Cybersecurity Analytics Portfolio Project

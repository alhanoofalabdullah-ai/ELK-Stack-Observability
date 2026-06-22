# 🚀 Project 03 – Security Log Monitoring & Threat Detection Platform

## Overview

The Security Log Monitoring & Threat Detection Platform is an enterprise-grade security analytics solution built using the ELK Stack.

The platform collects, processes, analyzes, and visualizes security events from enterprise systems to identify suspicious activities, security incidents, authentication failures, and potential cyber threats.

This project demonstrates how Security Operations Centers (SOC), Cybersecurity Teams, and Incident Response Teams use centralized log analytics to improve threat visibility and accelerate security investigations.

---

# Business Problem

Organizations face thousands of security events every day.

Common challenges include:

- Failed login attempts
- Unauthorized access attempts
- Privilege escalation activities
- Malware indicators
- Security alert overload
- Slow incident response
- Limited security visibility

Without centralized monitoring, detecting attacks becomes extremely difficult.

---

# Business Objectives

This solution enables organizations to:

- Centralize security logs
- Detect suspicious activities
- Improve threat visibility
- Accelerate investigations
- Support SOC operations
- Enhance security monitoring
- Improve compliance reporting

---

# Key Features

## Security Event Collection

Collect events from:

- Authentication Systems
- Active Directory
- Linux Servers
- Windows Servers
- Firewalls
- Web Applications
- APIs

---

## Threat Detection

Monitor:

- Failed Login Attempts
- Brute Force Attacks
- Unauthorized Access
- Suspicious User Activity
- Privilege Escalation
- Security Policy Violations

---

## Security Analytics

Analyze:

- User Activity
- Authentication Events
- Access Patterns
- Security Alerts
- Threat Trends

---

## Kibana Security Dashboards

Visualize:

- Failed Logins
- Top Threat Sources
- Critical Events
- Security Trends
- Security KPIs

---

# Architecture

```text
Security Devices
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
 Security Team
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

# Security Metrics

The platform tracks:

- Failed Login Attempts
- Successful Logins
- Security Alerts
- Critical Events
- Suspicious Activities
- Blocked IP Addresses
- Threat Indicators

---

# REST API

## Get Security Metrics

```http
GET /api/security/metrics
```

Response:

```json
{
  "failedLogins": 245,
  "successfulLogins": 12800,
  "criticalAlerts": 12,
  "suspiciousActivities": 18,
  "status": "Warning"
}
```

---

## Generate Security Event

```http
POST /api/security/event
```

---

# Threat Scenarios Covered

- Brute Force Attack
- Account Enumeration
- Suspicious Login Activity
- Excessive Authentication Failures
- Unauthorized Access Attempts
- Abnormal User Behavior

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

Elasticsearch

```text
http://localhost:9200
```

Kibana

```text
http://localhost:5601
```

Security API

```text
http://localhost:8080
```

---

# Use Cases

### SOC Teams

Monitor security events.

### Cybersecurity Analysts

Investigate incidents.

### Incident Response Teams

Identify threats.

### Compliance Teams

Review security logs.

### Security Managers

Track security KPIs.

---

# Future Enhancements

- SIEM Integration
- Threat Intelligence Feeds
- Machine Learning Detection
- UEBA Analytics
- MITRE ATT&CK Mapping
- SOAR Integration

---

# Skills Demonstrated

- ELK Stack
- Security Monitoring
- Threat Detection
- Kibana Dashboards
- Log Analytics
- Incident Response
- Security Operations
- Spring Boot
- Java
- Docker

---

# Author

Alhanoof Alabdullah

Enterprise Cybersecurity & ELK Stack Portfolio Project

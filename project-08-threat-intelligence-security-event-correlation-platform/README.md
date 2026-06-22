# 🚀 Project 08 – Threat Intelligence & Security Event Correlation Platform

## Overview

The Threat Intelligence & Security Event Correlation Platform is an enterprise-grade cybersecurity analytics solution that combines Threat Intelligence, Security Event Correlation, Threat Hunting, and Security Monitoring capabilities into a centralized ELK Stack platform.

The solution enables organizations to enrich security events with threat intelligence feeds, correlate indicators of compromise (IOCs), identify malicious activity, and improve threat detection capabilities.

This project simulates capabilities commonly found in enterprise SIEM and Threat Intelligence Platforms used by Security Operations Centers (SOC).

---

# Business Problem

Modern organizations face increasingly sophisticated cyber threats.

Challenges include:

- Massive security event volumes
- Unknown threat actors
- Lack of threat context
- Delayed investigations
- Alert fatigue
- Distributed attack indicators
- Difficult threat hunting processes

Security teams need automated enrichment and correlation to improve detection efficiency.

---

# Business Objectives

This platform helps organizations:

- Integrate threat intelligence feeds
- Correlate security events
- Identify malicious indicators
- Improve threat detection
- Accelerate investigations
- Support threat hunting
- Enhance SOC operations

---

# Key Features

## Threat Intelligence Integration

Support threat feeds containing:

- Malicious IP Addresses
- Malicious Domains
- Known Threat Actors
- Indicators of Compromise (IOCs)
- Malware Signatures

---

## Event Correlation

Correlate:

- Login Events
- Network Events
- Endpoint Events
- Firewall Logs
- Authentication Events

---

## IOC Detection

Detect:

- Known Malicious IPs
- Suspicious Domains
- Blacklisted URLs
- Known Malware Indicators
- Threat Actor Infrastructure

---

## Threat Hunting

Identify:

- Suspicious User Behavior
- Unusual Access Patterns
- Lateral Movement Indicators
- Persistent Threat Activities

---

## Security Analytics

Visualize:

- Threat Sources
- IOC Matches
- Threat Categories
- Threat Severity
- Correlated Security Events

---

# Architecture

```text
Threat Intelligence Feeds
            │
            ▼
      Log Enrichment
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
       SOC Analysts
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
| Containerization | Docker |
| Build Tool | Maven |

---

# Threat Intelligence Sources

Supported Indicators:

- IP Addresses
- Domains
- URLs
- Hashes
- Threat Actor Names
- Malware Families

---

# Event Correlation Scenarios

### Brute Force Correlation

```text
Multiple Failed Logins
+
Malicious IP Match
=
High Severity Alert
```

### Malware Correlation

```text
Suspicious Download
+
Known Malicious Domain
=
Critical Incident
```

### Account Compromise

```text
Successful Login
+
Impossible Travel
+
Known Threat IP
=
Account Compromise Alert
```

---

# REST API

## Get Threat Intelligence Metrics

```http
GET /api/threat-intelligence/metrics
```

Response

```json
{
  "securityEvents": 250000,
  "iocMatches": 142,
  "criticalThreats": 11,
  "activeInvestigations": 7,
  "status": "Critical"
}
```

---

## Submit Threat Indicator

```http
POST /api/threat-intelligence/indicator
```

---

# Security Metrics

Monitor:

- IOC Matches
- Threat Severity
- Threat Categories
- Malicious IP Activity
- Threat Hunting Cases
- Correlated Events
- Security Investigations

---

# Threat Categories

- Malware
- Phishing
- Botnet Activity
- Credential Theft
- Ransomware
- Data Exfiltration
- Insider Threats
- Advanced Persistent Threats

---

# Installation

Build project:

```bash
mvn clean package
```

Run platform:

```bash
docker-compose up -d
```

---

# Services

## Elasticsearch

http://localhost:9200

## Kibana

http://localhost:5601

## Threat Intelligence API

http://localhost:8080

---

# Use Cases

### SOC Teams

Monitor correlated threats.

### Threat Hunters

Identify hidden threats.

### Incident Responders

Investigate attacks.

### Cyber Threat Intelligence Teams

Manage indicators.

### Security Leadership

Track threat exposure.

---

# Future Enhancements

- MISP Integration
- VirusTotal Integration
- OpenCTI Integration
- MITRE ATT&CK Mapping
- SOAR Playbooks
- AI Threat Correlation
- Threat Intelligence Automation

---

# Skills Demonstrated

- ELK Stack
- Threat Intelligence
- IOC Management
- Threat Hunting
- Security Analytics
- Event Correlation
- Cybersecurity Monitoring
- Spring Boot
- Docker
- Kibana Dashboards

---

# Author

Alhanoof Alabdullah

Enterprise Threat Intelligence & Security Analytics Portfolio Project

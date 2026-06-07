# Project 07 – Threat Detection Analytics

Enterprise Threat Detection Analytics Platform using ELK Stack, Threat Intelligence, MITRE ATT&CK Framework, IOC Correlation, and Threat Hunting.

---

# Overview

This project demonstrates advanced cybersecurity analytics and threat detection capabilities.

The platform provides:

- Threat Hunting
- IOC Analysis
- MITRE ATT&CK Mapping
- Behavioral Analytics
- Threat Intelligence Correlation
- Security Investigations
- Advanced Threat Detection

The solution is designed for:

- SOC Analysts
- Threat Hunters
- Cybersecurity Engineers
- Incident Responders
- Security Operations Teams

---

# Business Scenario

Organizations face advanced cyber threats daily.

Examples include:

- Malware Infections
- Credential Attacks
- Privilege Escalation
- Lateral Movement
- Command & Control Activity
- Insider Threats

Traditional monitoring often detects attacks too late.

This project enables proactive threat detection and investigation.

---

# Architecture

Endpoints

↓

Firewalls

↓

IDS / IPS

↓

Filebeat

↓

Logstash

↓

Elasticsearch

↓

Threat Intelligence Correlation

↓

MITRE ATT&CK Mapping

↓

Kibana

↓

SOC Team

---

# Components

## Threat Intelligence

Monitors:

- Malicious IP Addresses
- Known Threat Actors
- IOC Feeds
- Threat Feeds

---

## Threat Hunting

Monitors:

- Suspicious Activities
- Unusual Behavior
- Advanced Threat Indicators
- Security Anomalies

---

## Behavioral Analytics

Monitors:

- User Behavior
- Host Behavior
- Network Behavior
- Privilege Abuse

---

## IOC Correlation

Monitors:

- IOC Matches
- Threat Feed Correlation
- Malicious Connections
- Threat Relationships

---

## MITRE ATT&CK Mapping

Monitors:

- Initial Access
- Execution
- Persistence
- Privilege Escalation
- Defense Evasion
- Credential Access
- Discovery
- Lateral Movement

---

# Dashboard Panels

## Threat Overview

Displays:

- Threat Score
- Threat Categories
- Active Threats
- Security Posture

---

## IOC Dashboard

Displays:

- IOC Matches
- Malicious IPs
- Malicious Domains
- Threat Indicators

---

## Threat Hunting Dashboard

Displays:

- Hunting Results
- Suspicious Events
- Behavioral Anomalies
- Investigation Findings

---

## MITRE ATT&CK Dashboard

Displays:

- ATT&CK Techniques
- ATT&CK Tactics
- Threat Coverage
- Detection Maturity

---

## Investigation Dashboard

Displays:

- Active Investigations
- Threat Timeline
- Threat Severity
- Incident Status

---

# Threat Hunting Use Cases

## Brute Force Detection

Condition:

- Multiple Failed Logins

---

## Privilege Escalation Detection

Condition:

- Unauthorized Administrative Access

---

## Lateral Movement Detection

Condition:

- Multiple Host Connections

---

## Malware Detection

Condition:

- IOC Match Found

---

## Command & Control Detection

Condition:

- Connection To Malicious Domain

---

# Monitoring Metrics

- threat_score
- threat_events_total
- malicious_ips_detected
- malicious_domains_detected
- ioc_matches
- attack_techniques_detected
- suspicious_logins
- anomaly_score

---

# Alert Rules

## Critical Threat Detected

Severity:

Critical

---

## IOC Match Detected

Severity:

Critical

---

## Privilege Escalation Detected

Severity:

Critical

---

## Malware Activity Detected

Severity:

Critical

---

## Lateral Movement Detected

Severity:

Critical

---

# Technologies Used

- Elasticsearch
- Logstash
- Kibana
- Filebeat
- MITRE ATT&CK
- Threat Intelligence
- Docker
- Linux

---

# Skills Demonstrated

- Threat Hunting
- IOC Analysis
- Threat Intelligence
- MITRE ATT&CK
- Security Analytics
- Incident Investigation
- Threat Detection Engineering
- SOC Operations

---

# Author

Alhanoof Alabdullah

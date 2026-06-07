# Project 06 – SIEM Dashboard

Enterprise Security Information and Event Management (SIEM) Dashboard using ELK Stack, Threat Intelligence, Correlation Rules, and Security Analytics.

---

# Overview

This project demonstrates enterprise-grade SIEM implementation using Elasticsearch, Logstash, Kibana, and Filebeat.

The platform centralizes security logs, correlates security events, detects threats, and provides SOC visibility.

The solution is designed for:

- SOC Analysts
- Cybersecurity Engineers
- Incident Response Teams
- Security Operations Centers
- Threat Hunters

---

# Business Scenario

Organizations generate security events from:

- Firewalls
- Servers
- Endpoints
- Authentication Systems
- IDS/IPS Systems
- Applications

Without SIEM capabilities:

- Threats remain hidden
- Security investigations become difficult
- Incident response becomes slower

This project provides centralized security monitoring and threat detection.

---

# Architecture

Security Devices

↓

Filebeat

↓

Logstash

↓

Elasticsearch

↓

Correlation Rules

↓

Kibana

↓

SOC Team

---

# Components

## Authentication Monitoring

Monitors:

- Successful Logins
- Failed Logins
- Account Lockouts
- Privileged Access

---

## Firewall Monitoring

Monitors:

- Blocked Traffic
- Allowed Traffic
- Security Violations
- Threat Indicators

---

## IDS Monitoring

Monitors:

- Intrusion Attempts
- Malware Activity
- Suspicious Traffic
- Attack Patterns

---

## Threat Intelligence

Monitors:

- Malicious IP Addresses
- Indicators of Compromise (IOC)
- Threat Feeds
- Known Attack Sources

---

## Security Correlation Engine

Detects:

- Brute Force Attacks
- Privilege Escalation
- Suspicious Logins
- Malware Activity
- Insider Threats

---

# Dashboard Panels

## SOC Overview

Displays:

- Security Health Score
- Active Incidents
- Threat Level
- Critical Alerts

---

## Authentication Dashboard

Displays:

- Login Events
- Failed Logins
- Lockouts
- Privileged Access

---

## Threat Dashboard

Displays:

- Threat Events
- Malicious IPs
- Security Violations
- Threat Trends

---

## Incident Dashboard

Displays:

- Open Incidents
- Critical Events
- Incident Severity
- Incident Status

---

## Threat Intelligence Dashboard

Displays:

- IOC Matches
- Threat Feeds
- Malicious Sources
- Threat Categories

---

# Correlation Rules

## Brute Force Attack

Condition:

- More than 10 failed logins within 5 minutes

---

## Privilege Escalation

Condition:

- Unauthorized privilege assignment detected

---

## Suspicious Login

Condition:

- Login from unusual IP address

---

## Malware Activity

Condition:

- IOC match detected

---

# Alert Rules

## Critical Threat Detected

Severity:

Critical

---

## Brute Force Attack

Severity:

Critical

---

## Malicious IP Detected

Severity:

Warning

---

## Privileged Access Abuse

Severity:

Critical

---

## Malware Activity Detected

Severity:

Critical

---

# Technologies Used

- Elasticsearch
- Logstash
- Kibana
- Filebeat
- Docker
- Linux
- Threat Intelligence
- SIEM

---

# Skills Demonstrated

- SIEM Engineering
- Threat Detection
- Security Analytics
- Log Correlation
- Threat Intelligence
- Incident Response
- Security Monitoring
- SOC Operations

---

# Author

Alhanoof Alabdullah

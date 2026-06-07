# Project 05 – Security Log Monitoring

Enterprise Security Log Monitoring using ELK Stack for authentication monitoring, audit logging, threat visibility, and security analytics.

---

# Overview

This project demonstrates centralized security monitoring using Elasticsearch, Logstash, Kibana, and Filebeat.

The solution provides:

- Authentication Monitoring
- Failed Login Detection
- Privileged Access Monitoring
- Audit Log Monitoring
- Firewall Event Analysis
- Security Event Visibility

---

# Business Scenario

Organizations generate security-related events every second.

Examples include:

- User Logins
- Failed Authentication Attempts
- Privileged Account Usage
- Firewall Events
- Administrative Activities
- Security Violations

Without centralized monitoring:

- Threats remain unnoticed
- Audit investigations become difficult
- Security visibility is limited

This project provides enterprise-level security log analytics.

---

# Architecture

Authentication Systems

↓

Filebeat

↓

Logstash

↓

Elasticsearch

↓

Kibana

↓

Security Team

---

Firewalls

↓

Filebeat

↓

Logstash

↓

Elasticsearch

↓

Kibana

---

Servers

↓

Filebeat

↓

Logstash

↓

Elasticsearch

↓

Kibana

---

# Components

## Authentication Monitoring

Monitors:

- Successful Logins
- Failed Logins
- Account Lockouts
- Login Sources

---

## Privileged Access Monitoring

Monitors:

- Administrator Activities
- Root Access
- Elevated Privileges
- Sensitive Actions

---

## Audit Monitoring

Monitors:

- User Activities
- Configuration Changes
- Administrative Events
- Security Policies

---

## Firewall Monitoring

Monitors:

- Allowed Connections
- Blocked Connections
- Security Violations
- Threat Indicators

---

# Dashboard Panels

## Security Overview

Displays:

- Security Health Status
- Authentication Events
- Threat Indicators
- Critical Alerts

---

## Authentication Dashboard

Displays:

- Successful Logins
- Failed Logins
- Lockout Events
- Authentication Trends

---

## Audit Dashboard

Displays:

- User Activities
- Administrative Changes
- Policy Modifications
- Audit Events

---

## Firewall Dashboard

Displays:

- Firewall Events
- Blocked Connections
- Security Violations
- Threat Activity

---

# Features

- Security Event Collection
- Authentication Analytics
- Audit Monitoring
- Threat Visibility
- Dashboard Visualization
- Security Reporting

---

# Technologies Used

- Elasticsearch
- Logstash
- Kibana
- Filebeat
- Docker
- Linux

---

# Skills Demonstrated

- Security Monitoring
- Audit Analysis
- Authentication Monitoring
- ELK Administration
- Security Analytics
- Threat Detection Fundamentals

---

# Author

Alhanoof Alabdullah

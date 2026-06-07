# Project 04 – Infrastructure Log Analytics

Enterprise Infrastructure Log Analytics using ELK Stack for monitoring servers, databases, network devices, and infrastructure services.

---

# Overview

This project demonstrates centralized infrastructure log analytics using Elasticsearch, Logstash, Kibana, and Filebeat.

The solution provides:

- Infrastructure Monitoring
- Server Analytics
- Database Monitoring
- Network Visibility
- Event Correlation
- Operational Insights

---

# Business Scenario

Enterprise environments contain:

- Linux Servers
- Windows Servers
- Web Servers
- Database Servers
- Firewalls
- Routers
- Switches

Without centralized visibility:

- Infrastructure issues remain unnoticed
- Root cause analysis becomes difficult
- Service outages take longer to resolve

This project provides complete infrastructure visibility.

---

# Architecture

Linux Servers

↓

Filebeat

↓

Logstash

↓

Elasticsearch

↓

Kibana

↓

Operations Team

---

Database Servers

↓

Filebeat

↓

Logstash

↓

Elasticsearch

↓

Kibana

---

Network Devices

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

## Linux Server Monitoring

Monitors:

- Authentication Events
- System Logs
- Service Logs
- Resource Events

---

## Database Monitoring

Monitors:

- Database Connections
- Slow Queries
- Query Failures
- Database Errors

---

## Web Server Monitoring

Monitors:

- HTTP Requests
- Access Logs
- Error Logs
- Performance Events

---

## Network Monitoring

Monitors:

- Firewall Logs
- Network Events
- Access Attempts
- Security Events

---

# Dashboard Panels

## Infrastructure Overview

Displays:

- Total Events
- Active Servers
- Infrastructure Health
- Critical Events

---

## Server Dashboard

Displays:

- Server Status
- Authentication Events
- Service Health
- Resource Warnings

---

## Database Dashboard

Displays:

- Database Errors
- Slow Queries
- Connection Events
- Query Statistics

---

## Network Dashboard

Displays:

- Firewall Activity
- Network Events
- Access Attempts
- Security Warnings

---

# Features

- Centralized Infrastructure Logs
- Multi-Server Monitoring
- Network Analytics
- Database Monitoring
- Dashboard Visualization
- Event Correlation

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

- Infrastructure Monitoring
- Log Analytics
- ELK Administration
- Network Monitoring
- Database Monitoring
- Operations Analytics

---

# Author

Alhanoof Alabdullah

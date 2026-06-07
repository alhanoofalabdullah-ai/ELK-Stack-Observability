# Project 02 – Centralized Log Collection

Enterprise Centralized Log Collection using ELK Stack and Filebeat.

---

# Overview

This project demonstrates how to collect logs from multiple servers and applications into a centralized Elasticsearch cluster.

The solution provides:

- Centralized Log Collection
- Multi-Server Monitoring
- Log Aggregation
- Searchable Log Repository
- Operational Visibility

---

# Business Scenario

Enterprise environments often consist of:

- Application Servers
- Web Servers
- Database Servers
- Linux Servers
- Security Systems

Without centralized logging:

- Troubleshooting becomes difficult
- Incident investigations take longer
- Monitoring visibility is limited

This solution provides a single platform for collecting and analyzing logs.

---

# Architecture

Server 01

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

Server 02

↓

Filebeat

↓

Logstash

↓

Elasticsearch

↓

Kibana

---

Application Server

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

## Filebeat

Responsible for:

- Log Collection
- Log Shipping
- Lightweight Data Transfer

---

## Logstash

Responsible for:

- Parsing Logs
- Data Transformation
- Routing Data

---

## Elasticsearch

Responsible for:

- Storage
- Search
- Analytics

---

## Kibana

Responsible for:

- Dashboards
- Search
- Visualization

---

# Project Objectives

- Collect Logs From Multiple Sources
- Build Centralized Logging Platform
- Create Searchable Log Repository
- Improve Operational Visibility
- Enable Faster Troubleshooting

---

# Features

- Multi-Server Log Collection
- Real-Time Log Ingestion
- Centralized Search
- Dashboard Analytics
- Log Categorization

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

- Log Aggregation
- Centralized Logging
- ELK Administration
- Log Analytics
- Monitoring Foundations

---

# Author

Alhanoof Alabdullah

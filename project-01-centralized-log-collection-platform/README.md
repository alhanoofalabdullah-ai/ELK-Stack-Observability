# 🚀 Project 01 – Centralized Log Collection Platform

## Overview

The Centralized Log Collection Platform is an enterprise-grade logging solution built using Elasticsearch, Logstash, Kibana, Spring Boot, and Docker.

The project demonstrates how organizations collect, process, index, and visualize logs from multiple systems through a centralized logging architecture.

This solution provides a single source of truth for operational events, application logs, infrastructure logs, and security events.

---

# Business Problem

Organizations often face challenges such as:

- Logs distributed across multiple servers
- Difficult troubleshooting processes
- Lack of centralized visibility
- Delayed incident investigations
- Poor operational observability
- Security event blind spots

Without centralized logging, identifying root causes becomes time-consuming and expensive.

---

# Business Objectives

This platform helps organizations:

- Centralize log management
- Improve troubleshooting
- Accelerate incident response
- Support security investigations
- Improve operational visibility
- Enable log analytics
- Enhance observability practices

---

# Key Features

## Log Collection

Collect logs from:

- Applications
- Servers
- Containers
- APIs
- Databases

---

## Log Processing

Process logs using:

- Parsing
- Filtering
- Enrichment
- Transformation

---

## Log Storage

Store logs in:

- Elasticsearch Indices

---

## Visualization

Visualize logs using:

- Kibana Dashboards
- Search Views
- Analytics Views

---

## Monitoring

Track:

- Log Volume
- Error Logs
- Warning Logs
- Critical Events
- Security Events

---

# Architecture

```text
Applications
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
Operations Team
```

---

# Technology Stack

| Layer | Technology |
|---------|------------|
| Backend | Spring Boot |
| Language | Java 21 |
| Search Engine | Elasticsearch |
| Log Processing | Logstash |
| Visualization | Kibana |
| Containerization | Docker |
| Build Tool | Maven |

---

# Project Structure

```text
project-01-centralized-log-collection-platform/

├── elasticsearch
├── logstash
├── kibana
├── spring-log-api
├── logs
├── docs
├── docker-compose.yml
└── README.md
```

---

# Log Categories

The platform supports:

- Application Logs
- Infrastructure Logs
- Security Logs
- Audit Logs
- Database Logs
- API Logs

---

# Sample Log Event

```json
{
  "timestamp":"2026-01-01T12:00:00",
  "level":"ERROR",
  "service":"user-service",
  "message":"Database connection failed"
}
```

---

# REST API

## Generate Log

```http
POST /api/logs
```

## Retrieve Log Statistics

```http
GET /api/logs/statistics
```

---

# Installation

Build project:

```bash
mvn clean package
```

Run environment:

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

Spring Boot API

```text
http://localhost:8080
```

---

# Use Cases

### Operations Teams

Centralized operational logging.

### Developers

Application troubleshooting.

### Security Teams

Security investigations.

### DevOps Teams

Infrastructure visibility.

---

# Future Enhancements

- SIEM Integration
- Alerting
- Machine Learning Detection
- Anomaly Detection
- Threat Intelligence

---

# Skills Demonstrated

- Elasticsearch
- Logstash
- Kibana
- Docker
- Java
- Spring Boot
- Log Analytics
- Centralized Logging
- Enterprise Observability

---

# Author

Alhanoof Alabdullah

Enterprise ELK Stack Portfolio Project

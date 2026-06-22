package com.alhanoof.elk.dto;

public class LogEventDTO {

    private String level;
    private String service;
    private String message;

    public LogEventDTO() {
    }

    public LogEventDTO(
            String level,
            String service,
            String message) {

        this.level = level;
        this.service = service;
        this.message = message;
    }

    public String getLevel() {
        return level;
    }

    public String getService() {
        return service;
    }

    public String getMessage() {
        return message;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

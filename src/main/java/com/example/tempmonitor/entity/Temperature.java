package com.example.tempmonitor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEMPERATURE")
public class Temperature {

    private @Id
    @GeneratedValue Long id;

    private double measurement;
    private long timestamp;
    private Long sensorId;

    public Temperature() {
    }

    public Temperature(double measurement, long timestamp, Long sensorId) {
        this.measurement = measurement;
        this.timestamp = timestamp;
        this.sensorId = sensorId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMeasurement() {
        return measurement;
    }

    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getSensorId() {
        return sensorId;
    }

    public void setSensorId(Long sensorId) {
        this.sensorId = sensorId;
    }
}


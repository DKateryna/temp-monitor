package com.example.tempmonitor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEASUREMENT")
public class Measurement {

    @Id
    @GeneratedValue
    private Long id;

    private double sensorValue;
    private long timestamp;
    private long sensorId;

    public Measurement() {
    }

    public Measurement(double sensorValue, long timestamp, long sensorId) {
        this.sensorValue = sensorValue;
        this.timestamp = timestamp;
        this.sensorId = sensorId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSensorValue() {
        return sensorValue;
    }

    public void setSensorValue(double valueOfTemperature) {
        this.sensorValue = valueOfTemperature;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getSensorId() {
        return sensorId;
    }

    public void setSensorId(long sensorId) {
        this.sensorId = sensorId;
    }
}

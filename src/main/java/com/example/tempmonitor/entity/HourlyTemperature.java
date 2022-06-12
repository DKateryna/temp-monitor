package com.example.tempmonitor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOURLY_TEMPERATURE")
public class HourlyTemperature {

    @Id
    @GeneratedValue
    private Long id;

    private double hourlyMaxTemperature;
    private double hourlyMinTemperature;
    private double hourlyAverageTemperature;


    public HourlyTemperature() {
    }

    public HourlyTemperature(double hourlyMaxTemperature, double hourlyMinTemperature, double hourlyAverageTemperature) {
        this.hourlyMaxTemperature = hourlyMaxTemperature;
        this.hourlyMinTemperature = hourlyMinTemperature;
        this.hourlyAverageTemperature = hourlyAverageTemperature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getHourlyMaxTemperature() {
        return hourlyMaxTemperature;
    }

    public void setHourlyMaxTemperature(double hourlyMaxTemperature) {
        this.hourlyMaxTemperature = hourlyMaxTemperature;
    }

    public double getHourlyMinTemperature() {
        return hourlyMinTemperature;
    }

    public void setHourlyMinTemperature(double hourlyMinTemperature) {
        this.hourlyMinTemperature = hourlyMinTemperature;
    }

    public double getHourlyAverageTemperature() {
        return hourlyAverageTemperature;
    }

    public void setHourlyAverageTemperature(double hourlyAverageTemperature) {
        this.hourlyAverageTemperature = hourlyAverageTemperature;
    }
}

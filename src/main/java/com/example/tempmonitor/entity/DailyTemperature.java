package com.example.tempmonitor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DAILY_TEMPERATURE")
public class DailyTemperature {

    @Id
    @GeneratedValue
    private Long id;

    private double dailyMaxTemperature;
    private double dailyMinTemperature;
    private double dailyAverageTemperature;

    public DailyTemperature() {
    }

    public DailyTemperature(double dailyMaxTemperature, double dailyMinTemperature, double dailyAverageTemperature) {
        this.dailyMaxTemperature = dailyMaxTemperature;
        this.dailyMinTemperature = dailyMinTemperature;
        this.dailyAverageTemperature = dailyAverageTemperature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getDailyMaxTemperature() {
        return dailyMaxTemperature;
    }

    public void setDailyMaxTemperature(double dailyMaxTemperature) {
        this.dailyMaxTemperature = dailyMaxTemperature;
    }

    public double getDailyMinTemperature() {
        return dailyMinTemperature;
    }

    public void setDailyMinTemperature(double dailyMinTemperature) {
        this.dailyMinTemperature = dailyMinTemperature;
    }

    public double getDailyAverageTemperature() {
        return dailyAverageTemperature;
    }

    public void setDailyAverageTemperature(double dailyAverageTemperature) {
        this.dailyAverageTemperature = dailyAverageTemperature;
    }
}

package com.example.tempmonitor.entity;

import com.example.tempmonitor.enums.AggretationType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGGREGATED_TEMPERATURE")
public class AggregatedTemperature {

    @Id
    @GeneratedValue
    private long id;

    private double maxValue;
    private double minValue;
    private double sum;
    private int numberOfValues;
    private AggretationType type;
    private int timestampId;


    public AggregatedTemperature() {
    }

    public AggregatedTemperature(double maxValue, double minValue, double sum, int numberOfValues, AggretationType type, int timestampId) {
        this.maxValue = maxValue;
        this.minValue = minValue;
        this.sum = sum;
        this.numberOfValues = numberOfValues;
        this.type = type;
        this.timestampId = timestampId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public double getMinValue() {
        return minValue;
    }

    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public int getNumberOfValues() {
        return numberOfValues;
    }

    public void setNumberOfValues(int numberOfValues) {
        this.numberOfValues = numberOfValues;
    }

    public AggretationType getType() {
        return type;
    }

    public void setType(AggretationType type) {
        this.type = type;
    }

    public int getTimestampId() {
        return timestampId;
    }

    public void setTimestampId(int timestampId) {
        this.timestampId = timestampId;
    }
}

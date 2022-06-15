package com.example.tempmonitor.service;

import com.example.tempmonitor.entity.Measurement;

import java.util.List;

public interface MeasurementService {
    List<Measurement> saveTemperatures(List<Measurement> measurement);
    List<Measurement> getAggregatedData();
}

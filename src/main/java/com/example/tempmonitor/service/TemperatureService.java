package com.example.tempmonitor.service;

import com.example.tempmonitor.entity.Temperature;

import java.util.List;

public interface TemperatureService {
    List<Temperature> saveAllTemperatureEntities(List<Temperature> temperatures);
    List<Temperature> getAllTemperatures();
}

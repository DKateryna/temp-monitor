package com.example.tempmonitor.service;

import com.example.tempmonitor.entity.Temperature;
import com.example.tempmonitor.repository.TemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("temperatureServiceImpl")
public class TemperatureServiceImpl implements TemperatureService {

    @Autowired
    private TemperatureRepository temperatureRepository;

    @Override
    @Transactional
    public List<Temperature> saveAllTemperatureEntities(List<Temperature> temperatures) {
        List<Temperature> response;
        response = temperatureRepository.saveAll(temperatures);
        return response;
    }

    @Override
    @Transactional
    public List<Temperature> getAllTemperatures() {
        return temperatureRepository.findAll();
    }
}

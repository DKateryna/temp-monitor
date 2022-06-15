package com.example.tempmonitor.service;

import com.example.tempmonitor.entity.Measurement;
import com.example.tempmonitor.repository.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("temperatureServiceImpl")
public class MeasurementServiceImpl implements MeasurementService {

    @Autowired
    private MeasurementRepository measurementRepository;

    @Override
    @Transactional
    public List<Measurement> saveTemperatures(List<Measurement> measurement) {
        return measurementRepository.saveAll(measurement);
    }

    @Override
    @Transactional
    public List<Measurement> getAggregatedData() {
//        TODO: implement aggregation
        return new ArrayList<>();
    }
}

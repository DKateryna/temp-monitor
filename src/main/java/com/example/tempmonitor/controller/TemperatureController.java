package com.example.tempmonitor.controller;

import com.example.tempmonitor.entity.Measurement;
import com.example.tempmonitor.service.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TemperatureController {
    @Autowired
    private final MeasurementService measurementService;

    public TemperatureController(MeasurementService measurementService) {
        this.measurementService = measurementService;
    }

    @RequestMapping(value = "/temperatures", method = RequestMethod.POST)
    @ResponseBody
    public List<Measurement> saveMeasurement(@RequestBody List<Measurement> temperatureList) {
        return measurementService.saveTemperatures(temperatureList);
    }

    @RequestMapping(value = "/temperatures", method = RequestMethod.GET)
    @ResponseBody
    public List<Measurement> getAggregatedData() {
        return measurementService.getAggregatedData();
    }
}

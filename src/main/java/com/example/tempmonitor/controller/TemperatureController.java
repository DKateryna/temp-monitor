package com.example.tempmonitor.controller;

import com.example.tempmonitor.entity.Temperature;
import com.example.tempmonitor.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemperatureController {
    @Autowired
    private final TemperatureService temperatureService;

    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public List<Temperature> saveTemperatureBulk(@RequestBody List<Temperature> temperatureList) {
        return temperatureService.saveAllTemperatureEntities(temperatureList);
    }

    @RequestMapping(value = "/temperatures", method = RequestMethod.GET)
    @ResponseBody
    public List<Temperature> getAllTemperatures() {
        return temperatureService.getAllTemperatures();
    }
}

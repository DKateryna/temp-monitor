package com.example.tempmonitor.controller;

import com.example.tempmonitor.entity.Temperature;
import com.example.tempmonitor.service.TemperatureService;
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
    private final TemperatureService temperatureService;

    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @RequestMapping(value = "/temperatures", method = RequestMethod.POST)
    @ResponseBody
    public List<Temperature> saveTemperatures(@RequestBody List<Temperature> temperatureList) {
        return temperatureService.saveTemperatures(temperatureList);
    }

    @RequestMapping(value = "/temperatures", method = RequestMethod.GET)
    @ResponseBody
    public List<Temperature> getTemperatures() {
        return temperatureService.getAllTemperatures();
    }
}

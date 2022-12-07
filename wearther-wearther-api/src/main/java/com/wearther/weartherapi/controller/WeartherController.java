package com.wearther.weartherapi.controller;

import com.wearther.weartherapi.service.WeartherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/weather-condition")
public class WeartherController {

    @Autowired
    WeartherService service;


}

package com.wearther.wearapi.controller;

import com.wearther.wearapi.domain.model.Clothes;
import com.wearther.wearapi.service.WearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clothes")
public class WearController {

    @Autowired
    WearService service;

    @GetMapping("/{condition}/{gender}")
    public List<Clothes> getClothes(@PathVariable("condition") String condition,
                                    @PathVariable("gender") String gender){
        return service.wearClothes(condition,gender);
    }
}

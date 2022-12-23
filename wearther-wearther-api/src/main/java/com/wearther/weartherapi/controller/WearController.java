package com.wearther.weartherapi.controller;

import com.wearther.weartherapi.dto.model.Clothes;
import com.wearther.weartherapi.service.WearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/{feelsLike}/{gender}")
    public ResponseEntity<List<Clothes>> getClothes(@PathVariable("feelsLike") String feelsLike,
                                     @PathVariable("gender") String gender){
        List<Clothes> clothes = service.getClothes(feelsLike, gender);
        return ResponseEntity.ok(clothes);
    }
}

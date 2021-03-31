package com.clase3.calorias.controllers;

import com.clase3.calorias.dtos.PlateDTO;
import com.clase3.calorias.dtos.PlateResultDTO;
import com.clase3.calorias.services.CaloriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class CaloriesRestController {
    @Autowired
    private CaloriesService caloriesService;

    @PostMapping("/calories")
    public PlateResultDTO calculateCalories(@RequestBody PlateDTO plate){
        return null;
    }

}

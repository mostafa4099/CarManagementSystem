package com.mostafa.carmanagementsystem.controller;

import com.mostafa.carmanagementsystem.Model.CarModel;
import com.mostafa.carmanagementsystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping({"/car/{carTypeId}/{partsList}"})
    public List<CarModel> getCars(
            @PathVariable("carTypeId") Long carTypeId,
            @Nullable @PathVariable("partsList") List<Long> partsList) {
        return carService.getCarList(carTypeId, partsList);
    }
}

package com.mostafa.carmanagementsystem.service;

import com.mostafa.carmanagementsystem.Model.CarModel;

import java.util.List;

public interface CarService {
    List<CarModel> getCarList(Long carTypeId, List<Long> partsIdList);
}

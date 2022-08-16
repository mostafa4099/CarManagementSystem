package com.mostafa.carmanagementsystem.service;

import com.mostafa.carmanagementsystem.Model.CarModel;
import com.mostafa.carmanagementsystem.entity.Car;
import com.mostafa.carmanagementsystem.entity.CarParts;
import com.mostafa.carmanagementsystem.entity.CarType;
import com.mostafa.carmanagementsystem.entity.Parts;
import com.mostafa.carmanagementsystem.repo.CarPartsRepo;
import com.mostafa.carmanagementsystem.repo.CarRepo;
import com.mostafa.carmanagementsystem.repo.CarTypeRepo;
import com.mostafa.carmanagementsystem.repo.PartsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo carRepo;

    @Autowired
    private CarTypeRepo carTypeRepo;

    @Autowired
    private CarPartsRepo carPartsRepo;

    @Override
    public List<CarModel> getCarList(Long carTypeId, List<Long> partsIdList) {
        List<Car> carList = new ArrayList<>();
        List<CarModel> carModelList = new ArrayList<>();

        CarType carType = carTypeRepo.findById(carTypeId).get();

        if(partsIdList.size()>0){
            List<CarParts> carPartsList = carPartsRepo.findAllByPartsId(partsIdList);
            if(carPartsList.size()>0){
                carList = carRepo.findByCarTypeAndAndCarPartsList(carType, carPartsList);
            }
        } else {
            carList = carRepo.findByCarType(carType);
        }

        if(carList.size()>0){
            carList.stream().forEach(car -> {
                CarModel carModel = new CarModel();
                carModel = carModel.setCarModel(car);
                carModelList.add(carModel);
            });
        }
        return carModelList;
    }
}

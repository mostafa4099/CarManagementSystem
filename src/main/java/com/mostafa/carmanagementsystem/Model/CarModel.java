package com.mostafa.carmanagementsystem.Model;

import com.mostafa.carmanagementsystem.entity.Car;
import com.mostafa.carmanagementsystem.entity.CarParts;
import com.mostafa.carmanagementsystem.entity.CarType;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarModel {
    private Long id;
    private String carName;
    private String carDesc;
    private double price;

    private CarTypeModel carTypeModel;
    private List<PartsModel> partsModelList = new ArrayList<>();

    public CarModel setCarModel(Car car) {
        this.id = car.getId();
        this.carName = car.getCarName();
        this.carDesc = car.getCarDesc();
        this.price = car.getPrice();
        this.carTypeModel = new CarTypeModel().setCarTypeModel(car.getCarType());

        for(CarParts carPart: car.getCarPartsList()){
            partsModelList.add(new PartsModel().setPartsModel(carPart.getParts()));
        }

        return this;
    }
}

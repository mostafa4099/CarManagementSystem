package com.mostafa.carmanagementsystem.Model;

import com.mostafa.carmanagementsystem.entity.CarType;
import lombok.*;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.carmanagementsystem.Model.CarTypeModel.java: CarManagementSystem
 * @CreationDate 8/16/2022 3:15 PM
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarTypeModel {
    private long id;
    private String typeCode;
    private String typeName;

    public CarTypeModel setCarTypeModel(CarType carType) {
        this.id = carType.getId();
        this.typeCode = carType.getTypeCode();
        this.typeName = carType.getTypeName();
        return this;
    }
}

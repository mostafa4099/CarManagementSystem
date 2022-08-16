package com.mostafa.carmanagementsystem.Model;

import com.mostafa.carmanagementsystem.entity.Parts;
import lombok.*;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.carmanagementsystem.Model.PartsModel.java: CarManagementSystem
 * @CreationDate 8/16/2022 3:17 PM
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PartsModel {
    private Long id;
    private String partsName;
    private String partsDesc;

    public PartsModel setPartsModel(Parts parts) {
        this.id = parts.getId();
        this.partsName = parts.getPartsName();
        this.partsDesc = parts.getPartsDesc();
        return this;
    }
}

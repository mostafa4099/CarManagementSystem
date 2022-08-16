package com.mostafa.carmanagementsystem.entity;

import lombok.*;
import javax.persistence.*;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.carmanagementsystem.entity.Parts.java: CarManagementSystem
 * @CreationDate 8/16/2022 2:33 PM
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="parts")
public class Parts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String partsName;
    private String partsDesc;
}

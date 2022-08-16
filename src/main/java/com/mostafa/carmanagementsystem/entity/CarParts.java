package com.mostafa.carmanagementsystem.entity;

import lombok.*;
import javax.persistence.*;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.carmanagementsystem.entity.CarParts.java: CarManagementSystem
 * @CreationDate 8/16/2022 3:05 PM
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="car_parts")
public class CarParts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="car_id", nullable = false)
    private Car car;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="parts_id", insertable = true, updatable = true)
    private Parts parts;
}

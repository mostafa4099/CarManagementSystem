package com.mostafa.carmanagementsystem.repo;

import com.mostafa.carmanagementsystem.entity.Car;
import com.mostafa.carmanagementsystem.entity.CarParts;
import com.mostafa.carmanagementsystem.entity.CarType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepo extends JpaRepository<Car, Long> {
    List<Car> findByCarType(CarType carType);
    List<Car> findByCarTypeAndAndCarPartsList(CarType carType, List<CarParts> carPartsList);
}

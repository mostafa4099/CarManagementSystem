package com.mostafa.carmanagementsystem.repo;

import com.mostafa.carmanagementsystem.entity.CarType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarTypeRepo extends JpaRepository<CarType, Long> {
}

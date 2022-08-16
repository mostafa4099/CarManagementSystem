package com.mostafa.carmanagementsystem.repo;

import com.mostafa.carmanagementsystem.entity.CarParts;
import com.mostafa.carmanagementsystem.entity.Parts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarPartsRepo extends JpaRepository<CarParts, Long> {
    List<CarParts> findAllByPartsId(List<Long> partsList);
}

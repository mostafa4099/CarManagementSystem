package com.mostafa.carmanagementsystem.repo;

import com.mostafa.carmanagementsystem.entity.Parts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartsRepo extends JpaRepository<Parts, Long> {
}

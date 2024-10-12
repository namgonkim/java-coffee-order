package com.cony.cafe.repository;

import com.cony.cafe.entity.Barista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BaristaRepository extends JpaRepository<Barista, Long> {
    List<Barista> findAllByOrderByIdDesc();
}

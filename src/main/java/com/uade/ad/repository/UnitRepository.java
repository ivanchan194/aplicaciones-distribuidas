package com.uade.ad.repository;

import com.uade.ad.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Integer> {
    Unit findUnitByIdUnit(int id);
}

package com.uade.ad.repository;

import com.uade.ad.model.Step;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface StepRepository extends JpaRepository<Step, Integer> {
    @Modifying
    @Query("DELETE FROM Step s WHERE s.idStep in ?1")
    void deleteStepByIdStepIn(List<Integer> ids);
}

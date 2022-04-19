package com.uade.ad.repository;

import com.uade.ad.model.Conversions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversionsRepository extends JpaRepository<Conversions, Integer> {
}

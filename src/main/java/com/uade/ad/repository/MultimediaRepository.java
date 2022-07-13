package com.uade.ad.repository;

import com.uade.ad.model.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MultimediaRepository extends JpaRepository<Multimedia, Integer> {
    @Modifying
    @Query("DELETE FROM Multimedia m WHERE m.idContent in ?1")
    void deleteMultimediaByIdMultimediaIn(List<Integer> ids);
}

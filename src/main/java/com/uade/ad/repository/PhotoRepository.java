package com.uade.ad.repository;

import com.uade.ad.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Integer> {
    @Modifying
    @Query("DELETE FROM Photo p WHERE p.idPhoto in ?1")
    void deletePhotoByIdPhotoIn(List<Integer> ids);
}

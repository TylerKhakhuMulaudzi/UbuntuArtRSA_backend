package com.ubuntuartsa.backend.repository;

import com.ubuntuartsa.backend.model.Artist;
import com.ubuntuartsa.backend.enums.DisabilityType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<Artist,Long> {
    Optional<Artist> findByUserId (Long userId);
    Page<Artist> findByVerified(Boolean verified,Pageable pageable);
    Page<Artist> findByLocationProvince (String province, Pageable pageable);
    List<Artist> findTop10ByOrderByCreatedAtDesc();
    Long countByVerified(Boolean verified);
}

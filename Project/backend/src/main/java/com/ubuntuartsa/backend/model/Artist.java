package com.ubuntuartsa.backend.model;

import com.ubuntuartsa.backend.enums.DisabilityType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


    @Entity
    @Table(name = "artist")
    @Data
    @NoArgsConstructor
    @AllArgsConstructor

    public class Artist {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @OneToOne
        @JoinColumn(name = "user_id",nullable = false,unique = true)
        private User user;

        @Column(length = 1000)
        private String bio;

        @ElementCollection
        @CollectionTable(name = "artist_focus",joinColumns = @JoinColumn(name= "artist_id"))
        @Column(name = "focus_area")
        private List<String> artistFocus = new ArrayList<>();

        @Column(name = "location_province")
        private String locationProvince;

        @Column(name = "location_city")
        private String locationCity;

        @Enumerated(EnumType.STRING)
        @Column(name = "disability_type")
        private DisabilityType disabilityType;

        @Column(name = "verified")
        private Boolean verified = false;

        @Column(name = "wallet_balance", precision = 10,scale = 2)
        private BigDecimal walletBalance = BigDecimal.ZERO;

        @ElementCollection
        @CollectionTable(name = "portfolio_images", joinColumns = @JoinColumn(name = "artist_id"))
        @Column(name = "image_url")
        private List<String> portfolioImages = new ArrayList<>();

        @CreationTimestamp
        @Column(name = "created_at", updatable = false)
        private LocalDateTime createdAt;

        @UpdateTimestamp
        @Column(name = "updated_at")
        private LocalDateTime updatedAt;

}

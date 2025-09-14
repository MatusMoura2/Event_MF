package com.eventosmf.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventosmf.api.domain.cupon.Cupon;

public interface CouponRepository extends JpaRepository<Cupon, UUID>{

}

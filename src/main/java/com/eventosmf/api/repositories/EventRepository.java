package com.eventosmf.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventosmf.api.domain.event.Event;

public interface EventRepository extends JpaRepository<Event, UUID>{

}

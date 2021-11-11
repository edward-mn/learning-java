package com.spring.eventsapp.repository;

import com.spring.eventsapp.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsappRepository extends JpaRepository<Event, Long> {
}

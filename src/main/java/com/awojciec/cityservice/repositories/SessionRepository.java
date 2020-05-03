package com.awojciec.cityservice.repositories;

import com.awojciec.cityservice.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}

package com.phcodegyan.H2DatabaseSetup.repositories;

import com.phcodegyan.H2DatabaseSetup.models.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerRepository extends JpaRepository<Consumer, Long> {
}

package com.swa3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.swa3.model.Waste;

public interface WasteRepository extends JpaRepository<Waste, Long> {}


package com.example.kinoxp.Backend.repositories;

import com.example.kinoxp.Backend.model.ShowingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowingRepository extends JpaRepository<ShowingModel, Integer> {
}

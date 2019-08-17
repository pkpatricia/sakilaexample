package com.example.sakilaexample;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sakilaexample.model.Actor;

public interface SakilaRepository extends JpaRepository<Actor, Integer> {
}

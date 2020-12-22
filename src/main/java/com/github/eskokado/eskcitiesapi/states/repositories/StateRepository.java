package com.github.eskokado.eskcitiesapi.states.repositories;

import com.github.eskokado.eskcitiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

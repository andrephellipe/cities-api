package com.github.andrephellipe.states.repositories;

import com.github.andrephellipe.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {

}

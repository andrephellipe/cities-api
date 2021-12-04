package com.github.andrephellipe.countries.repositories;

import com.github.andrephellipe.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}

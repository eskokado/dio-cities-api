package com.github.eskokado.eskcitiesapi.countries.repositories;

import com.github.eskokado.eskcitiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

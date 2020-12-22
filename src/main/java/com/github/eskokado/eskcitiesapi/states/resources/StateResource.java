package com.github.eskokado.eskcitiesapi.states.resources;

import com.github.eskokado.eskcitiesapi.states.entities.State;
import com.github.eskokado.eskcitiesapi.states.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository repository;

    @GetMapping
    public Page<State> states(Pageable page) {
        return repository.findAll(page);
    }
}

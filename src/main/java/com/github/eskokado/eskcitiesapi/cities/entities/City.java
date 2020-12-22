package com.github.eskokado.eskcitiesapi.cities.entities;

import com.github.eskokado.eskcitiesapi.states.entities.State;

import javax.persistence.*;

@Entity
@Table(name = "cidade")
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @ManyToOne
    @JoinColumn(name = "uf", referencedColumnName = "id")
    private State state;

    private Integer ibge;

    @Column(name = "lat_lon")
    private String geolocation;

    public City() {
    }

    public City(final Long id, final String name, final State state, final Integer ibge,
                final String geolocation) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.ibge = ibge;
        this.geolocation = geolocation;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }

    public Integer getIbge() {
        return ibge;
    }

    public String getGeolocation() {
        return geolocation;
    }

}


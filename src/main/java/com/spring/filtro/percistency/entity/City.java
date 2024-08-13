package com.spring.filtro.percistency.entity;

import jakarta.persistence.*;



@Entity
@Table(name = "city")

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "namecity", length = 50, nullable = false)
    private String nameCity;

    @ManyToOne
    @JoinColumn(name = "codereg")
    private Region region;

    public City() {
    }

    public City(String nameCity, Region region) {
        this.nameCity = nameCity;
        this.region = region;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "City [id=" + id + ", nameCity=" + nameCity + ", region=" + region + "]";
    }


}

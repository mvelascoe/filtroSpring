package com.spring.filtro.percistency.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "region")
public class Region {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "namereg", length = 50, nullable = false)
    private String namereg;

    @ManyToOne
    @JoinColumn(name = "codecountry") 
    private Country country;

    public Region() {
    }

    public Region(String namereg, Country country) {
        this.namereg = namereg;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamereg() {
        return namereg;
    }

    public void setNamereg(String namereg) {
        this.namereg = namereg;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Region [id=" + id + ", namereg=" + namereg + ", country=" + country + "]";
    }
}

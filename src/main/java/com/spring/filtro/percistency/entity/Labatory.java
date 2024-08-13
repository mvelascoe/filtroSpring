package com.spring.filtro.percistency.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="labatory")
public class Labatory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "namelab", length = 50, nullable = false)
    private String namelab;

    @ManyToOne
    @JoinColumn(name = "codecityreg")
    private City city;

    public Labatory() {
    }

    public Labatory(String namelab, City city) {
        this.namelab = namelab;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamelab() {
        return namelab;
    }

    public void setNamelab(String namelab) {
        this.namelab = namelab;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Labatory [id=" + id + ", namelab=" + namelab + ", city=" + city + "]";
    };

    
    
}

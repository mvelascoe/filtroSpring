package com.spring.filtro.percistency.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="modeadministration")
public class Modeadministration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descriptionmode", length = 60, nullable = false)
    private String name;

    public Modeadministration() {
    }

    public Modeadministration(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Modeadministration [id=" + id + ", name=" + name + "]";
    }

}


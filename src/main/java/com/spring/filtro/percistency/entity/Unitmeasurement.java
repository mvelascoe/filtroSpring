package com.spring.filtro.percistency.entity;


import jakarta.persistence.*;

@Entity
@Table(name ="unitmeasurement")
public class Unitmeasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descriptionmode", length = 60, nullable = false)
    private String description;

    public Unitmeasurement() {
    }

    public Unitmeasurement(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Unitmeasurement [id=" + id + ", description=" + description + "]";
    }

    
}

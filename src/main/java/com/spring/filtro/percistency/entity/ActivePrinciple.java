package com.spring.filtro.percistency.entity;


import jakarta.persistence.*;

@Entity
@Table(name ="activeprinciple")
public class ActivePrinciple {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idap")
    private Long id;

    @Column(name = "nameap", length = 50, nullable = false)
    private String name;

    public ActivePrinciple() {
    }

    public ActivePrinciple(String name) {
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
        return "ActivePrinciple [id=" + id + ", name=" + name + "]";
    }

    
}

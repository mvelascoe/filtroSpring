package com.spring.filtro.percistency.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "namecustomer", length = 50, nullable = false)
    private String name;

    @Column(name = "lastnamecustomer", length = 50, nullable = false)
    private String lastname;

    @ManyToOne
    @JoinColumn(name = "codecitycustomer")
    private City city;

    @Column(name = "emailcustomer", length = 100, nullable = false)
    private String email;

    @Column(name = "birthdate", length = 100, nullable = false)
    private String birthdate;

    @Column(name = "Ion", length = 100, nullable = false)
    private String ion;

    @Column(name = "latitud", length = 100, nullable = false)
    private String latitud;

    public Customer() {
    }

   

    public Customer(String name, String lastname, City city, String email, String birthdate, String ion,
        String latitud) {
        this.name = name;
        this.lastname = lastname;
        this.city = city;
        this.email = email;
        this.birthdate = birthdate;
        this.ion = ion;
        this.latitud = latitud;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }



    public String getIon() {
        return ion;
    }



    public void setIon(String ion) {
        this.ion = ion;
    }



    public String getLatitud() {
        return latitud;
    }



    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }



    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", lastname=" + lastname + ", city=" + city + ", email="
                + email + ", birthdate=" + birthdate + ", ion=" + ion + ", latitud=" + latitud + "]";
    }
}

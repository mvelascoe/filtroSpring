package com.spring.filtro.percistency.entity;


import jakarta.persistence.*;

@Entity
@Table(name ="farmacy")
public class Farmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "namefarmacy", length = 60, nullable = false)
    private String name;

    @Column(name = "addressfarmacy", length = 60, nullable = false)
    private String address;

    @Column(name = "longi", length = 60, nullable = false)
    private boolean longi;

    @Column(name = "latfarmacy", length = 60, nullable = false)
    private String latfarmacy;

    @ManyToOne
    @JoinColumn(name = "codecityfarm")
    private City city;

    @Column(name = "logofarmacy", length = 60, nullable = false)
    private String logo;

    public Farmacy() {
    }


    public Farmacy(String name, String address, boolean longi, String latfarmacy, City city, String logo) {
        this.name = name;
        this.address = address;
        this.longi = longi;
        this.latfarmacy = latfarmacy;
        this.city = city;
        this.logo = logo;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isLongi() {
        return longi;
    }

    public void setLongi(boolean longi) {
        this.longi = longi;
    }

    public String getLatfarmacy() {
        return latfarmacy;
    }

    public void setLatfarmacy(String latfarmacy) {
        this.latfarmacy = latfarmacy;
    }


    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }


    public City getCity() {
        return city;
    }


    public void setCity(City city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "Farmacy [id=" + id + ", name=" + name + ", address=" + address + ", longi=" + longi + ", latfarmacy="
                + latfarmacy + ", city=" + city + ", logo=" + logo + "]";
    }

}

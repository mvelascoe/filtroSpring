package com.spring.filtro.percistency.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="farmacymedicine")
public class FamacyMedicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "idfarmacy")
    private Medicine medicine;

    @ManyToOne
    @JoinColumn(name = "idmedicinefatrm")
    private Farmacy farmacy;

    @Column(name = "price", nullable = false)
    private boolean price;

    public FamacyMedicine() {
    }

    public FamacyMedicine(Medicine medicine, Farmacy farmacy, boolean price) {
        this.medicine = medicine;
        this.farmacy = farmacy;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Farmacy getFarmacy() {
        return farmacy;
    }

    public void setFarmacy(Farmacy farmacy) {
        this.farmacy = farmacy;
    }

    public boolean isPrice() {
        return price;
    }

    public void setPrice(boolean price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FamacyMedicine [id=" + id + ", medicine=" + medicine + ", farmacy=" + farmacy + ", price=" + price
                + "]";
    }

}

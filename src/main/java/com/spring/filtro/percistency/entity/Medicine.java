package com.spring.filtro.percistency.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "medicine")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "proceedings", length = 10, nullable = false)
    private String proceedings;

    @Column(name = "namemedicine", length = 100, nullable = false)
    private String name;

    @Column(name = "healtresgister", length = 50, nullable = false)
    private String healtresgister;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "descriptionshort", length = 60, nullable = false)
    private String descriptionshort;

    @ManyToOne
    @JoinColumn(name = "codemodeadmin")
    private Modeadministration modeadministration;

    @ManyToOne
    @JoinColumn(name = "codeap")
    private ActivePrinciple activePrinciple;

    @ManyToOne
    @JoinColumn(name = "codeum")
    private Unitmeasurement iUnitmeasurement;

    @Column(name = "namerol", length = 100, nullable = false)
    private String namerol;

    @ManyToOne
    @JoinColumn(name = "codelap")
    private Labatory labatory;

    public Medicine() {
    }

    public Medicine(String proceedings, String name, String healtresgister, String description, String descriptionshort,
            String namerol) {
        this.proceedings = proceedings;
        this.name = name;
        this.healtresgister = healtresgister;
        this.description = description;
        this.descriptionshort = descriptionshort;
        this.namerol = namerol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProceedings() {
        return proceedings;
    }

    public void setProceedings(String proceedings) {
        this.proceedings = proceedings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealtresgister() {
        return healtresgister;
    }

    public void setHealtresgister(String healtresgister) {
        this.healtresgister = healtresgister;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionshort() {
        return descriptionshort;
    }

    public void setDescriptionshort(String descriptionshort) {
        this.descriptionshort = descriptionshort;
    }

    public Modeadministration getModeadministration() {
        return modeadministration;
    }

    public void setModeadministration(Modeadministration modeadministration) {
        this.modeadministration = modeadministration;
    }

    public ActivePrinciple getActivePrinciple() {
        return activePrinciple;
    }

    public void setActivePrinciple(ActivePrinciple activePrinciple) {
        this.activePrinciple = activePrinciple;
    }

    public Unitmeasurement getiUnitmeasurement() {
        return iUnitmeasurement;
    }

    public void setiUnitmeasurement(Unitmeasurement iUnitmeasurement) {
        this.iUnitmeasurement = iUnitmeasurement;
    }

    public String getNamerol() {
        return namerol;
    }

    public void setNamerol(String namerol) {
        this.namerol = namerol;
    }

    public Labatory getLabatory() {
        return labatory;
    }

    public void setLabatory(Labatory labatory) {
        this.labatory = labatory;
    }

    @Override
    public String toString() {
        return "Medicine [id=" + id + ", proceedings=" + proceedings + ", name=" + name + ", healtresgister="
                + healtresgister + ", description=" + description + ", descriptionshort=" + descriptionshort
                + ", modeadministration=" + modeadministration + ", activePrinciple=" + activePrinciple
                + ", iUnitmeasurement=" + iUnitmeasurement + ", namerol=" + namerol + ", labatory=" + labatory + "]";
    }

}

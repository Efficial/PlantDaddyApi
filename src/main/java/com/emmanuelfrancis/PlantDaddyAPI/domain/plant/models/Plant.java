package com.emmanuelfrancis.PlantDaddyAPI.domain.plant.models;

import com.emmanuelfrancis.PlantDaddyAPI.domain.plant.enums.Placement;
import com.emmanuelfrancis.PlantDaddyAPI.domain.plant.enums.SunlightRequired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private PlantCare plantCare;

    public Plant() {
    }

    public Plant(String name, String description, PlantCare plantCare) {
        this.name = name;
        this.description = description;
        this.plantCare = plantCare;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PlantCare getPlantCare() {
        return plantCare;
    }

    public void setPlantCare(PlantCare plantCare) {
        this.plantCare = plantCare;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", plantCare=" + plantCare +
                '}';
    }
}


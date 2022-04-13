package com.emmanuelfrancis.PlantDaddyAPI.domain.plant.models;

import com.emmanuelfrancis.PlantDaddyAPI.domain.plant.enums.Placement;
import com.emmanuelfrancis.PlantDaddyAPI.domain.plant.enums.SunlightRequired;
import com.emmanuelfrancis.PlantDaddyAPI.domain.plant.enums.WaterFrequency;

public class PlantCare {
    private Placement placement;
    private SunlightRequired sunlightRequired;
    private WaterFrequency waterFrequency;

    public PlantCare(Placement placement, SunlightRequired sunlightRequired, WaterFrequency waterFrequency) {
        this.placement = placement;
        this.sunlightRequired = sunlightRequired;
        this.waterFrequency = waterFrequency;
    }

    public Placement getPlacement() {
        return placement;
    }

    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    public SunlightRequired getSunlightRequired() {
        return sunlightRequired;
    }

    public void setSunlightRequired(SunlightRequired sunlightRequired) {
        this.sunlightRequired = sunlightRequired;
    }

    public WaterFrequency getWaterFrequency() {
        return waterFrequency;
    }

    public void setWaterFrequency(WaterFrequency waterFrequency) {
        this.waterFrequency = waterFrequency;
    }
}

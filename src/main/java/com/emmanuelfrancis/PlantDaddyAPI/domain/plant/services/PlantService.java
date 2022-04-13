package com.emmanuelfrancis.PlantDaddyAPI.domain.plant.services;

import com.emmanuelfrancis.PlantDaddyAPI.domain.plant.exceptions.PlantNotFoundException;
import com.emmanuelfrancis.PlantDaddyAPI.domain.plant.models.Plant;

public interface PlantService {
    Plant create(Plant plant) throws PlantNotFoundException;
    Plant getById(Long id) throws PlantNotFoundException;
    Plant update(Plant plant) throws PlantNotFoundException;
    void delete(Long id) throws PlantNotFoundException;


}

package com.emmanuelfrancis.PlantDaddyAPI.domain.plant.repos;

import com.emmanuelfrancis.PlantDaddyAPI.domain.plant.models.Plant;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PlantRepo extends CrudRepository <Plant, Long>{
    Optional<Plant> findByName(String name);


}

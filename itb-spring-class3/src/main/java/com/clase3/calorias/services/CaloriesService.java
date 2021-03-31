package com.clase3.calorias.services;

import com.clase3.calorias.dtos.CaloriesDTO;
import com.clase3.calorias.dtos.IngredientDTO;
import com.clase3.calorias.dtos.PlateDTO;
import com.clase3.calorias.dtos.PlateResultDTO;
import com.clase3.calorias.repositories.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CaloriesService {
    private final FoodRepository foodRepository;

    public CaloriesService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public PlateResultDTO calcularCaloriasPlato(PlateDTO plato){

        ArrayList<IngredientDTO> ingredients = plato.getIngredients();
        PlateResultDTO result = new PlateResultDTO();

        for (IngredientDTO ingredient: ingredients){
            CaloriesDTO calories = foodRepository.obtenerCaloriasPorNombre(ingredient.getName());
            result.addIngredientRes(ingredient.getName(),ingredient.getQuantity(),calories.getCalories(),ingredient.getQuantity()*calories.getCalories());
        }
        return null;
    }
}

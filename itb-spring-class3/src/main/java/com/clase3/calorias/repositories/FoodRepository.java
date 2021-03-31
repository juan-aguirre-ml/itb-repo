package com.clase3.calorias.repositories;

import com.clase3.calorias.dtos.CaloriesDTO;

public interface FoodRepository {
    CaloriesDTO obtenerCaloriasPorNombre(String nombreIngrediente);
}

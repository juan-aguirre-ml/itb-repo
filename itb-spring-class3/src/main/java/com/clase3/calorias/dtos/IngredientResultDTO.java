package com.clase3.calorias.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class IngredientResultDTO {
    private String name;
    private int quantity;
    private int calories;
    private int totalCalories;

}

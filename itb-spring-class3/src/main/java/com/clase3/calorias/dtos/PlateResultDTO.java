package com.clase3.calorias.dtos;

import lombok.*;

import java.util.ArrayList;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlateResultDTO {
    private String name;
    private int totalCalories;

    private ArrayList<IngredientResultDTO> ingredients;
    private String mostCaloric;

    public void addIngredientRes(String name,int quantity, int calories, int totalCalories){
        IngredientResultDTO result = new IngredientResultDTO(name,quantity,calories,totalCalories);
        ingredients.add(result);
    }

}

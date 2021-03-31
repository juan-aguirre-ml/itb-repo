package com.clase3.calorias.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Data
@Getter
@Setter
@AllArgsConstructor
public class PlateDTO {
    private String name;
    private ArrayList<IngredientDTO> ingredients;
}


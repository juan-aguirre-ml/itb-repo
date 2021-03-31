package com.clase3.calorias.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Data
@Getter
@Setter
@AllArgsConstructor
public class IngredientDTO {
    private String name;
    private int quantity;

}

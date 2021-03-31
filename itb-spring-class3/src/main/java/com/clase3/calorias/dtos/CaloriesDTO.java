package com.clase3.calorias.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class CaloriesDTO {
    private String name;
    private int calories;
}

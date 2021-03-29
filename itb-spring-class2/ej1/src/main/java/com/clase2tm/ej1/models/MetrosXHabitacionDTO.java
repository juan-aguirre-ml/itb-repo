package com.clase2tm.ej1.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@Data
@AllArgsConstructor
@Getter
@Setter
public class MetrosXHabitacionDTO {
    private String nombreCasa;
    private HashMap<String,Double> habitaciones;

    public MetrosXHabitacionDTO() {
        this.habitaciones = new HashMap<String,Double>();
    }

    public void putHabitacion(String nombreHab, double area){
        habitaciones.put(nombreHab,area);
    }
}

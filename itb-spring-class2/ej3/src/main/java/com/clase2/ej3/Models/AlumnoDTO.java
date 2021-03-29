package com.clase2.ej3.Models;

import lombok.*;

import java.util.HashMap;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDTO {
    private String nombre;
    private HashMap<String,Float> notas;

    public float calcularPromedio(){
        float suma = 0;
        for (String materia:this.notas.keySet()){
            suma+=this.notas.get(materia);
        }
        return suma/this.notas.size();
    }

}

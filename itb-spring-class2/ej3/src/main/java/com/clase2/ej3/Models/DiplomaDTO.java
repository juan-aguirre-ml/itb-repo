package com.clase2.ej3.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class DiplomaDTO {
    private String nombre;
    private float promedio;
    private String mensaje;

    public DiplomaDTO(String nombre, float promedio) {
        this.nombre=nombre;
        this.promedio = promedio;
        if (promedio>=9){
            this.mensaje = "Felicitaciones por ser tan crack";
        }
        else{
            this.mensaje = "";
        }
    }

}

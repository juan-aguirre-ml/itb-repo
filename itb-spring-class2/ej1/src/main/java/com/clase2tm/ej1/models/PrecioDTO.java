package com.clase2tm.ej1.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PrecioDTO {
    private String nombre;
    private String direccion;
    private float area;
    private float precio;

    public float calcularPrecio(float precioMetroCuadrado){
        return this.area*precioMetroCuadrado;
    }
}

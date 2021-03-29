package com.clase2tm.ej1.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class CasaDTO {
    private String nombre;
    private String direccion;
    private List<HabitacionDTO> habitaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<HabitacionDTO> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<HabitacionDTO> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void addHabitacion(HabitacionDTO hab){
        this.habitaciones.add(hab);
    }

    public float getAreaTotal(){
        float areaTotal = 0;
        for (HabitacionDTO hab:this.habitaciones){
            areaTotal += hab.getArea();
        }
        return areaTotal;
    }
}

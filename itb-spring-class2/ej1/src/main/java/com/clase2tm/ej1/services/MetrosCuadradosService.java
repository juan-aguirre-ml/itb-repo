package com.clase2tm.ej1.services;

import com.clase2tm.ej1.models.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MetrosCuadradosService {

    public static AreaDTO getArea( CasaDTO casa){
        AreaDTO area = new AreaDTO();
        ArrayList<HabitacionDTO> habs = new ArrayList<HabitacionDTO>(casa.getHabitaciones());
        casa.setHabitaciones(habs);
        area.setNombre(casa.getNombre());
        area.setDireccion(casa.getDireccion());
        area.setArea(casa.getAreaTotal());
        return area;

    }

    public static PrecioDTO getPrecio(CasaDTO casa){
        PrecioDTO precio = new PrecioDTO();
        precio.setArea(getArea(casa).getArea());
        precio.setNombre(casa.getNombre());
        precio.setDireccion(casa.getDireccion());
        precio.setPrecio(precio.calcularPrecio(800));
        return precio;
    }

    public static HabitacionDTO getMasGrande(CasaDTO casa) {
        float area = 0;
        HabitacionDTO habitacion = null;
        List<HabitacionDTO> habitaciones = casa.getHabitaciones();
        for (HabitacionDTO hab: habitaciones){
            if (hab.getArea() > area){
                habitacion=hab;
                area = hab.getArea();
            }
        }
        return habitacion;

    }

    public static MetrosXHabitacionDTO getMetrosXHab(CasaDTO casa){
        MetrosXHabitacionDTO areas = new MetrosXHabitacionDTO();
        areas.setNombreCasa(casa.getNombre());
        for (HabitacionDTO hab: casa.getHabitaciones()){
            areas.putHabitacion(hab.getNombre(),hab.getArea());
        }
        return areas;
    }
}

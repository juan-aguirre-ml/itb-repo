package com.clase2tm.ej1.controllers;


import com.clase2tm.ej1.models.*;
import com.clase2tm.ej1.services.MetrosCuadradosService;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MetrosCuadradosController {
    
    @PostMapping("/area")
    @ResponseBody
    public AreaDTO area(@RequestBody CasaDTO casa){
        return MetrosCuadradosService.getArea(casa);
    }

    @PostMapping("/precio")
    @ResponseBody
    public PrecioDTO precio(@RequestBody CasaDTO casa){
        return MetrosCuadradosService.getPrecio(casa);
    }

    @PostMapping("/masgrande")
    @ResponseBody
    public HabitacionDTO masgrande(@RequestBody CasaDTO casa){

        return MetrosCuadradosService.getMasGrande(casa);
    }

    @PostMapping("/habitaciones")
    @ResponseBody
    public MetrosXHabitacionDTO habitaciones(@RequestBody CasaDTO casa){

        return MetrosCuadradosService.getMetrosXHab(casa);
    }
    
}

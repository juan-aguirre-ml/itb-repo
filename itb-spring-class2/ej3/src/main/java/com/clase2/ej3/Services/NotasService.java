package com.clase2.ej3.Services;

import com.clase2.ej3.Models.AlumnoDTO;
import com.clase2.ej3.Models.DiplomaDTO;
import org.springframework.stereotype.Service;

@Service
public class NotasService {
    public static DiplomaDTO darDiploma(AlumnoDTO alumno){
        return new DiplomaDTO(alumno.getNombre(),alumno.calcularPromedio());
    }
}

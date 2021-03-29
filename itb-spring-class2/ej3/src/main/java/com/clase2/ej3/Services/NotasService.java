package com.clase2.ej3.Services;

import com.clase2.ej3.Models.AlumnoDTO;
import com.clase2.ej3.Models.Diploma;
import org.springframework.stereotype.Service;

@Service
public class NotasService {
    public static Diploma darDiploma(AlumnoDTO alumno){
        return new Diploma(alumno.getNombre(),alumno.calcularPromedio());
    }
}

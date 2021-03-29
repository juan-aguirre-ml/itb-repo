package com.clase2.ej3.Controllers;

import com.clase2.ej3.Models.AlumnoDTO;
import com.clase2.ej3.Models.Diploma;
import com.clase2.ej3.Services.NotasService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotasController {
    @PostMapping("/diploma")
    @ResponseBody
    public Diploma darDiploma(@RequestBody AlumnoDTO alumno){

        return NotasService.darDiploma(alumno);
    }
}

package com.OMJR.act1_t4.Controllers;

import com.OMJR.act1_t4.Services.Estudiante;
import com.OMJR.act1_t4.Services.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PruebaController {

    @Autowired
    private PruebaService pruebaService;

    @GetMapping("/api/obtenerNombre")
    public String getNombre() {
        return pruebaService.obtenerNombre();
    }

    @GetMapping("/api/obtenerDatos")
    public Estudiante getEstudiante() {
        return pruebaService.obtenerEstudiante();
    }

    @GetMapping("/api/obtenerFrase")
    public String getFrase() {
        return pruebaService.obtenerFrase();
    }
}

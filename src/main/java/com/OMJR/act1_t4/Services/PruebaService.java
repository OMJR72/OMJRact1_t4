package com.OMJR.act1_t4.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.OMJR.act1_t4.Services.Estudiante;
@Service
public class PruebaService{

    Estudiante estudiante = new Estudiante("Orlando Miguel", "Jarquin Rivera", 20, "Ingenieria en Sistemas");
    
    String frase = "El que tiene un porqué para vivir puede soportar casi cualquier cómo";
    
    public String obtenerNombre(){
        return "Orlando Miguel Jarquin Rivera";
    }

    public String obtenerFrase(){
        return frase;
    }

    public Estudiante obtenerEstudiante(){
        return estudiante;
    }
}

package com.OMJR.act1_t4.Services;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private int edad;
    private String carrera;

    public Estudiante(String nombre, String apellidos, int edad, String carrera) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }
}

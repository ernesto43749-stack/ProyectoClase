package com.ejemplo.uml;

// Herencia: 'Estudiante' extiende de 'Persona' (hereda sus atributos y métodos)
public class Estudiante extends com.ejemplo.uml.Persona {
    private String matricula;

    // Constructor que invoca al constructor del padre usando super()
    public Estudiante(String nombre, String direccion, String dni, String matricula) {
        super(nombre, direccion, dni);
        this.matricula = matricula;
    }

    // Polimorfismo: Sobrescribimos el método del padre para adaptarlo a Estudiante
    @Override
    public void describirRol() {
        System.out.println("-> Estudiante: Hola, soy " + nombrePublico + " y mi matrícula es " + matricula);
    }
}
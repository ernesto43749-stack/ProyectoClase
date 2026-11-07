package com.ejemplo.uml;

// Herencia: 'Profesor' también extiende de 'Persona'
public class Profesor extends com.ejemplo.uml.Persona {
    private String departamento;

    public Profesor(String nombre, String direccion, String dni, String departamento) {
        super(nombre, direccion, dni);
        this.departamento = departamento;
    }

    // Polimorfismo: Reinterpretación del método describirRol
    @Override
    public void describirRol() {
        System.out.println("-> Profesor: Hola, soy " + nombrePublico + " y enseño en el departamento de " + departamento);
    }
}
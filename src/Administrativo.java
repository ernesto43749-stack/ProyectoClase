package com.ejemplo.uml;

// Herencia: Tercera clase hija que hereda de 'Persona'
public class Administrativo extends com.ejemplo.uml.Persona {
    private String oficina;

    public Administrativo(String nombre, String direccion, String dni, String oficina) {
        super(nombre, direccion, dni);
        this.oficina = oficina;
    }

    // Polimorfismo: Reinterpretación propia del método describirRol
    @Override
    public void describirRol() {
        System.out.println("-> Administrativo: Hola, soy " + nombrePublico + " y trabajo en la oficina " + oficina);
    }
}
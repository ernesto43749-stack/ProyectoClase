package com.ejemplo.uml;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

// Clase Padre que concentra atributos de herencia, encapsulamiento y tipos de datos
public class Persona {

    // --- 1. ENCAPSULAMIENTO: Atributos con diferentes modificadores de acceso ---
    public String nombrePublico;         // Accesible desde cualquier clase
    protected String direccionProtegida; // Accesible desde clases hijas o el mismo paquete
    private String dniPrivado;           // Oculto, solo accesible mediante getters/setters

    // --- 2. VARIABLES: 7 tipos primitivos intercalados con sus respectivos wrappers (no primitivos) ---
    int edadPrimitiva;           // 1. primitivo
    Integer edadObjeto;          // 1. no primitivo (Wrapper)

    double alturaPrimitiva;      // 2. primitivo
    Double alturaObjeto;         // 2. no primitivo

    char generoPrimitivo;        // 3. primitivo
    Character generoObjeto;      // 3. no primitivo

    boolean activoPrimitivo;     // 4. primitivo
    Boolean activoObjeto;        // 4. no primitivo

    long idPrimitiva;            // 5. primitivo
    Long idObjeto;               // 5. no primitivo

    float pesoPrimitiva;         // 6. primitivo
    Float pesoObjeto;            // 6. no primitivo

    byte nivelPrimitivo;         // 7. primitivo
    Byte nivelObjeto;            // 7. no primitivo

    // --- 3. COLECCIONES SOLICITADAS ---
    ArrayList<String> listaCursos;                 // ArrayList para almacenar elementos secuenciales
    LinkedList<String> historialActividades;       // LinkedList eficiente para inserciones/eliminaciones
    HashSet<String> conjuntoHabilidades;           // HashSet para elementos únicos sin duplicados
    HashMap<String, String> mapaContactos;         // HashMap para almacenar pares clave-valor

    // Constructor de la clase padre
    public Persona(String nombrePublico, String direccionProtegida, String dniPrivado) {
        this.nombrePublico = nombrePublico;
        this.direccionProtegida = direccionProtegida;
        this.dniPrivado = dniPrivado;

        // Inicialización de las colecciones
        this.listaCursos = new ArrayList<>();
        this.historialActividades = new LinkedList<>();
        this.conjuntoHabilidades = new HashSet<>();
        this.mapaContactos = new HashMap<>();
    }

    // --- MÉTODOS GETTER Y SETTER PARA EL ENCAPSULAMIENTO DEL DNI PRIVADO ---
    public String getDniPrivado() {
        return dniPrivado;
    }

    public void setDniPrivado(String dniPrivado) {
        this.dniPrivado = dniPrivado;
    }

    // --- 4. POLIMORFISMO: Método base que será reescrito (reinterpretado) en las clases hijas ---
    public void describirRol() {
        System.out.println("Soy una persona genérica dentro del sistema.");
    }
}
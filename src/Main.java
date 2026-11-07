package com.ejemplo.uml;

public class Main {
    public static void main(String[] args) {
        // --- POLIMORFISMO EN LA CREACIÓN DE OBJETOS ---
        // Se declara la variable de tipo 'Persona' (Padre), pero se instancia usando las clases Hijas
        com.ejemplo.uml.Persona p1 = new com.ejemplo.uml.Estudiante("Sofía Ruiz", "Calle Norte 12", "12345678A", "MAT-2026-9");
        com.ejemplo.uml.Persona p2 = new com.ejemplo.uml.Profesor("Carlos Mendoza", "Av. Central 45", "87654321B", "Ingeniería de Software");
        com.ejemplo.uml.Persona p3 = new com.ejemplo.uml.Administrativo("Lucía Gómez", "Plaza Mayor 3", "11223344C", "Edificio B - Oficina 204");

        // --- ENCAPSULAMIENTO EN ACCIÓN ---
        // Modificamos y obtenemos el atributo privado usando los métodos seguros Getter y Setter
        p1.setDniPrivado("99887766X");
        System.out.println("DNI privado actualizado de p1 (vía Encapsulamiento): " + p1.getDniPrivado());

        // --- ARREGLO DE OBJETOS PARA EL POLIMORFISMO ---
        com.ejemplo.uml.Persona[] grupoPersonas = {p1, p2, p3};

        System.out.println("\n=== EJECUCIÓN DEL CICLO FOR POLIMÓRFICO ===");
        // --- CICLO FOR ---
        // Recorre el arreglo ejecutando el método describirRol de cada objeto de forma dinámica
        for (int i = 0; i < grupoPersonas.length; i++) {
            grupoPersonas[i].describirRol();
        }

        // --- ASIGNACIÓN DE DATOS PRIMITIVOS Y NO PRIMITIVOS INTERCALADOS ---
        p1.edadPrimitiva = 21;
        p1.edadObjeto = Integer.valueOf(21);

        p1.alturaPrimitiva = 1.68;
        p1.alturaObjeto = Double.valueOf(1.68);

        System.out.println("\nEjemplo de tipos primitivos vs no primitivos en el estudiante:");
        System.out.println("- Edad primitiva: " + p1.edadPrimitiva + " | Edad objeto (Integer): " + p1.edadObjeto);
        System.out.println("- Altura primitiva: " + p1.alturaPrimitiva + " | Altura objeto (Double): " + p1.alturaObjeto);

        // --- USO DE COLECCIONES ---
        p1.listaCursos.add("Programación Orientada a Objetos");
        p1.historialActividades.add("Inscripción realizada");
        p1.conjuntoHabilidades.add("Java");
        p1.mapaContactos.put("Emergencia", "Mamá: 555-1234");

        System.out.println("\nCurso registrado en ArrayList: " + p1.listaCursos.get(0));
    }
}
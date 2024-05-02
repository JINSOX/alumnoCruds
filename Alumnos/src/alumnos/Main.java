/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instanciamos la clase AlumnosDAO
        AlumnoDAO alumnosDAO = new AlumnoDAO();

        // Creamos algunos alumnos de ejemplo
        Alumnos alumno1 = new Alumnos(1, "Apellido1", "Apellido2", "Nombre1", "Carrera1", "Domicilio1", "01/01/2001");
        Alumnos alumno2 = new Alumnos(2, "Apellido3", "Apellido4", "Nombre2", "Carrera2", "Domicilio2", "02/02/2002");

        // Agregamos los alumnos a la base de datos
        alumnosDAO.agregarAlumno(alumno1);
        alumnosDAO.agregarAlumno(alumno2);

        // Obtenemos todos los alumnos
        List<Alumnos> listaAlumnos = alumnosDAO.obtenerTodosLosAlumnos();
        System.out.println("Lista de alumnos:");
        for (Alumnos alumno : listaAlumnos) {
            System.out.println(alumno.getCodigoAlumno() + ": " + alumno.getNombres() + " " + alumno.getApellidoPaterno());
        }

        // Actualizamos un alumno
        alumno1.setNombres("NuevoNombre");
        alumnosDAO.actualizarAlumno(alumno1);

        // Mostramos la información actualizada del alumno
        Alumnos alumnoActualizado = alumnosDAO.obtenerAlumnoPorCodigo(1);
        System.out.println("Información actualizada del alumno 1:");
        System.out.println("Nombre: " + alumnoActualizado.getNombres());

        // Eliminamos un alumno
        alumnosDAO.eliminarAlumno(2);

        // Mostramos la lista de alumnos después de la eliminación
        listaAlumnos = alumnosDAO.obtenerTodosLosAlumnos();
        System.out.println("Lista de alumnos después de la eliminación:");
        for (Alumnos alumno : listaAlumnos) {
            System.out.println(alumno.getCodigoAlumno() + ": " + alumno.getNombres() + " " + alumno.getApellidoPaterno());
        }
    }
}


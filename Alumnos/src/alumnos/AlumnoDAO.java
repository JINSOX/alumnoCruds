/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnos;

import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {
    // Simulación de una base de datos en memoria utilizando una lista
    private static List<Alumnos> listaAlumnos = new ArrayList<>();

    public void agregarAlumno(Alumnos alumno) {
        listaAlumnos.add(alumno);
    }

    public void actualizarAlumno(Alumnos alumno) {
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getCodigoAlumno() == alumno.getCodigoAlumno()) {
                listaAlumnos.set(i, alumno);
                return;
            }
        }
    }

    public void eliminarAlumno(int codigoAlumno) {
        listaAlumnos.removeIf(alumno -> alumno.getCodigoAlumno() == codigoAlumno);
    }

    public Alumnos obtenerAlumnoPorCodigo(int codigoAlumno) {
        for (Alumnos alumno : listaAlumnos) {
            if (alumno.getCodigoAlumno() == codigoAlumno) {
                return alumno;
            }
        }
        return null; // Si no se encuentra ningún alumno con el código dado
    }

    public List<Alumnos> obtenerTodosLosAlumnos() {
        return listaAlumnos;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnos;

import java.util.Date;

public class Alumnos {
    private int codigoAlumno;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombres;
    private String carreraProfesional;
    private String domicilio;
    private Date fechaNacimiento; // Change to Date type

    // Constructor, getters and setters
    public Alumnos(int codigoAlumno, String apellidoPaterno, String apellidoMaterno, String nombres,
                  String carreraProfesional, String domicilio, Date fechaNacimiento) {
        this.codigoAlumno = codigoAlumno;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
        this.carreraProfesional = carreraProfesional;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(int codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCarreraProfesional() {
        return carreraProfesional;
    }

    public void setCarreraProfesional(String carreraProfesional) {
        this.carreraProfesional = carreraProfesional;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}

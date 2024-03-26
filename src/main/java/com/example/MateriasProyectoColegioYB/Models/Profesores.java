package com.example.MateriasProyectoColegioYB.Models;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "profesores")
public class Profesores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private Long antiguedad;
    private String matricula;
    private Long edad;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "profesores")
    private List<Cursos> cursos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Long getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Long antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(List<Cursos> cursos) {
        this.cursos = cursos;
    }

    public Profesores() {
    }

    public Profesores(Long id, String nombre, String apellido, Date fechaDeNacimiento, Long antiguedad, String matricula, Long edad, List<Cursos> cursos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.antiguedad = antiguedad;
        this.matricula = matricula;
        this.edad = edad;
        this.cursos = cursos;
    }
}

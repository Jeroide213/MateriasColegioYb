package com.example.MateriasProyectoColegioYB.Models;

import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "alumnos")
public class Alumnos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private String fichaMedica;
    private String ciclo;
    private String especialidad;
    private Long faltas;
    private Long amonestaciones;
    private String planillaDeCalificaciones;
    private Long Edad;
    @ManyToMany(mappedBy = "alumnos")
    private Set<Cursos> cursos;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "alumnos", cascade = CascadeType.ALL)
    private Set<Calificaciones> calificaciones;

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

    public String getFichaMedica() {
        return fichaMedica;
    }

    public void setFichaMedica(String fichaMedica) {
        this.fichaMedica = fichaMedica;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Long getFaltas() {
        return faltas;
    }

    public void setFaltas(Long faltas) {
        this.faltas = faltas;
    }

    public Long getAmonestaciones() {
        return amonestaciones;
    }

    public void setAmonestaciones(Long amonestaciones) {
        this.amonestaciones = amonestaciones;
    }

    public String getPlanillaDeCalificaciones() {
        return planillaDeCalificaciones;
    }

    public void setPlanillaDeCalificaciones(String planillaDeCalificaciones) {
        this.planillaDeCalificaciones = planillaDeCalificaciones;
    }

    public Long getEdad() {
        return Edad;
    }

    public void setEdad(Long edad) {
        Edad = edad;
    }

    public Set<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Cursos> cursos) {
        this.cursos = cursos;
    }

    public Set<Calificaciones> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Set<Calificaciones> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Alumnos() {
    }

    public Alumnos(Long id, String nombre, String apellido, Date fechaDeNacimiento, String fichaMedica, String ciclo, String especialidad, Long faltas, Long amonestaciones, String planillaDeCalificaciones, Long edad, Set<Cursos> cursos, Set<Calificaciones> calificaciones) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.fichaMedica = fichaMedica;
        this.ciclo = ciclo;
        this.especialidad = especialidad;
        this.faltas = faltas;
        this.amonestaciones = amonestaciones;
        this.planillaDeCalificaciones = planillaDeCalificaciones;
        Edad = edad;
        this.cursos = cursos;
        this.calificaciones = calificaciones;
    }
}
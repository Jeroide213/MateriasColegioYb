package com.example.MateriasProyectoColegioYB.Models;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "cursos")
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String especialidad;
    @ManyToOne
    @JoinColumn(name = "materiaid")
    private Materias materias;
    @ManyToOne
    @JoinColumn(name = "profesorid")
    private Profesores profesores;
    @ManyToMany
    @JoinTable(
            name = "cursos_alumnos",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "alumno_id")
    )
    private List<Alumnos> alumnos;

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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    public Profesores getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesores profesores) {
        this.profesores = profesores;
    }

    public List<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    public Cursos() {
    }

    public Cursos(Long id, String nombre, String especialidad, Materias materias, Profesores profesores, List<Alumnos> alumnos) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.materias = materias;
        this.profesores = profesores;
        this.alumnos = alumnos;
    }
}

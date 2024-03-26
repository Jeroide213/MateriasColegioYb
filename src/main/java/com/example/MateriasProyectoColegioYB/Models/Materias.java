package com.example.MateriasProyectoColegioYB.Models;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "materias")
public class Materias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Enumerated(EnumType.STRING)
    private MateriaGrado grado;
    @OneToMany(mappedBy = "materias", cascade = CascadeType.ALL)
    private List<HorarioMaterias> horariosMaterias;
    @ManyToOne
    @JoinColumn(name = "profesorId")
    private Profesores profesores;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "materias")
    private List<Cursos> courses;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "materias", cascade = CascadeType.ALL)
    private List<Calificaciones> grades;

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

    public MateriaGrado getGrado() {
        return grado;
    }

    public void setGrado(MateriaGrado grado) {
        this.grado = grado;
    }

    public List<HorarioMaterias> getHorariosMaterias() {
        return horariosMaterias;
    }

    public void setHorariosMaterias(List<HorarioMaterias> horariosMaterias) {
        this.horariosMaterias = horariosMaterias;
    }

    public Profesores getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesores profesores) {
        this.profesores = profesores;
    }

    public List<Cursos> getCourses() {
        return courses;
    }

    public void setCourses(List<Cursos> courses) {
        this.courses = courses;
    }

    public List<Calificaciones> getGrades() {
        return grades;
    }

    public void setGrades(List<Calificaciones> grades) {
        this.grades = grades;
    }

    public Materias() {
    }

    public Materias(Long id, String nombre, MateriaGrado grado, List<HorarioMaterias> horariosMaterias, Profesores profesores, List<Cursos> courses, List<Calificaciones> grades) {
        this.id = id;
        this.nombre = nombre;
        this.grado = grado;
        this.horariosMaterias = horariosMaterias;
        this.profesores = profesores;
        this.courses = courses;
        this.grades = grades;
    }
}

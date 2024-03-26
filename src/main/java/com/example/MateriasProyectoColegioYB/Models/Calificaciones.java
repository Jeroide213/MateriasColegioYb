package com.example.MateriasProyectoColegioYB.Models;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "calificaciones")
public class Calificaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valor;
    @ManyToOne
    @JoinColumn(name = "alumnoId")
    private Alumnos alumnos;
    @ManyToOne
    @JoinColumn(name = "materiaId")
    private Materias materias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Alumnos getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumnos alumnos) {
        this.alumnos = alumnos;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    public Calificaciones() {
    }

    public Calificaciones(Long id, BigDecimal valor, Alumnos alumnos, Materias materias) {
        this.id = id;
        this.valor = valor;
        this.alumnos = alumnos;
        this.materias = materias;
    }
}

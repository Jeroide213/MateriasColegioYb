package com.example.MateriasProyectoColegioYB.Models;

import javax.persistence.*;


import java.time.LocalTime;

@Entity
public class HorarioMaterias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private DiaSemana dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
    @ManyToOne
    @JoinColumn(name = "cursosId")
    private Materias materias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DiaSemana getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DiaSemana dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    public HorarioMaterias() {
    }

    public HorarioMaterias(Long id, DiaSemana dayOfWeek, LocalTime startTime, LocalTime endTime, Materias materias) {
        this.id = id;
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.materias = materias;
    }
}
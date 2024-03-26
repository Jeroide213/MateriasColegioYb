package com.example.MateriasProyectoColegioYB.Service;

import com.example.MateriasProyectoColegioYB.Models.Alumnos;

import java.util.List;

public interface AlumnosService {
    Alumnos saveAlumno(Alumnos alumnos);
    List<Alumnos> getAllAlumnos();
    Alumnos getAlumnoById(Long alumnosId);
    void deleteAlumno(Long alumnosId);
}

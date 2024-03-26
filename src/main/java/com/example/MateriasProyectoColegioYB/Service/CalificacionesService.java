package com.example.MateriasProyectoColegioYB.Service;

import com.example.MateriasProyectoColegioYB.Models.Calificaciones;

import java.util.List;

public interface CalificacionesService {
    Calificaciones saveCalificaciones(Calificaciones calificaciones);
    List<Calificaciones> getAllCalificaciones();
    List<Calificaciones> getCalificacionesByAlumnosId(Long alumnoId);
    List<Calificaciones> getCalificacionesByMateriaId(Long materiaId);
}

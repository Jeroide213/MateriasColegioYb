package com.example.MateriasProyectoColegioYB.Service;

import com.example.MateriasProyectoColegioYB.Models.Calificaciones;

import com.example.MateriasProyectoColegioYB.Repository.CalificacionesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalificacionesServiceImpl implements CalificacionesService {

    @Autowired
    private CalificacionesRepo calificacionesRepository;

    @Override
    public Calificaciones saveCalificaciones(Calificaciones calificaciones) {
        return calificacionesRepository.save(calificaciones);
    }

    @Override
    public List<Calificaciones> getAllCalificaciones() {
        return calificacionesRepository.findAll();
    }

    @Override
    public List<Calificaciones> getCalificacionesByAlumnosId(Long alumnoId) {
        return calificacionesRepository.findByAlumnosId(alumnoId);
    }

    @Override
    public List<Calificaciones> getCalificacionesByMateriaId(Long materiaId) {
        return calificacionesRepository.findByMateriasId(materiaId);
    }
}

package com.example.MateriasProyectoColegioYB.Repository;

import com.example.MateriasProyectoColegioYB.Models.Calificaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalificacionesRepo extends JpaRepository<Calificaciones, Long> {
    List<Calificaciones> findByAlumnosId(Long alumnoId);
    List<Calificaciones> findByMateriasId(Long materiaId);
}

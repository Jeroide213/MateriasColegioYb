package com.example.MateriasProyectoColegioYB.Repository;

import com.example.MateriasProyectoColegioYB.Models.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesoresRepo extends JpaRepository<Profesores, Long> {
}

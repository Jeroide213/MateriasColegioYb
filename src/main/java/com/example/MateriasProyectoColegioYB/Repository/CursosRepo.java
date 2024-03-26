package com.example.MateriasProyectoColegioYB.Repository;

import com.example.MateriasProyectoColegioYB.Models.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosRepo extends JpaRepository<Cursos, Long> {
}

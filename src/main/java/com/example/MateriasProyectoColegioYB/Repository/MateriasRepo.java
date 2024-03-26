package com.example.MateriasProyectoColegioYB.Repository;

import com.example.MateriasProyectoColegioYB.Models.Materias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriasRepo extends JpaRepository<Materias, Long> {
}

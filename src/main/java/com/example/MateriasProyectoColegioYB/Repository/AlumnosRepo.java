package com.example.MateriasProyectoColegioYB.Repository;

import com.example.MateriasProyectoColegioYB.Models.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface AlumnosRepo extends JpaRepository<Alumnos, Long> {
}

package com.example.MateriasProyectoColegioYB.Service;

import com.example.MateriasProyectoColegioYB.Models.Cursos;
import java.util.List;

public interface CursosService {
    Cursos getCursoById(Long cursoId);

    Cursos createCurso(Cursos curso);

    Cursos updateCurso(Long cursoId, Cursos curso);

    void deleteCurso(Long cursoId);

    List<Cursos> getAllCursos();
}

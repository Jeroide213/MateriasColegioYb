package com.example.MateriasProyectoColegioYB.Service;

import com.example.MateriasProyectoColegioYB.Models.Cursos;
import com.example.MateriasProyectoColegioYB.Repository.CursosRepo;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CursosServiceImpl implements CursosService {

    @Autowired
    private CursosRepo cursosRepository;

    @Override
    public Cursos getCursoById(Long cursoId) {
        return cursosRepository.findById(cursoId).orElse(null);
    }

    @Override
    public Cursos createCurso(Cursos curso) {
        return cursosRepository.save(curso);
    }

    @Override
    public Cursos updateCurso(Long cursoId, Cursos curso) {
        if(cursosRepository.existsById(cursoId)) {
            curso.setId(cursoId);
            return cursosRepository.save(curso);
        } else {
            return null;
        }
    }

    @Override
    public void deleteCurso(Long cursoId) {
        cursosRepository.deleteById(cursoId);
    }

    @Override
    public List<Cursos> getAllCursos() {
        return cursosRepository.findAll();
    }
}

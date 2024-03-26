package com.example.MateriasProyectoColegioYB.Service;

import com.example.MateriasProyectoColegioYB.Models.Profesores;
import com.example.MateriasProyectoColegioYB.Repository.ProfesoresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesoresServiceImpl implements ProfesoresService {

    @Autowired
    private ProfesoresRepo profesoresRepository;

    @Override
    public Profesores saveProfesores(Profesores profesores) {
        return profesoresRepository.save(profesores);
    }

    @Override
    public List<Profesores> getAllProfesores() {
        return profesoresRepository.findAll();
    }

    @Override
    public Profesores getProfesoresById(Long profesoresId) {
        return profesoresRepository.findById(profesoresId).orElse(null);
    }

    @Override
    public void deleteProfesores(Long profesoresId) {
        profesoresRepository.deleteById(profesoresId);
    }
}


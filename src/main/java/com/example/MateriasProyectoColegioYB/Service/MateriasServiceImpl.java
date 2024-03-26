package com.example.MateriasProyectoColegioYB.Service;

import com.example.MateriasProyectoColegioYB.Models.Materias;
import com.example.MateriasProyectoColegioYB.Repository.MateriasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriasServiceImpl implements MateriasService {

    @Autowired
    private MateriasRepo materiasRepository;

    @Override
    public Materias saveMaterias(Materias materias) {
        return materiasRepository.save(materias);
    }

    @Override
    public List<Materias> getAllMaterias() {
        return materiasRepository.findAll();
    }

    @Override
    public Materias getMateriasById(Long materiasId) {
        return materiasRepository.findById(materiasId).orElse(null);
    }

    @Override
    public void deleteMaterias(Long materiasId) {
        materiasRepository.deleteById(materiasId);
    }
}


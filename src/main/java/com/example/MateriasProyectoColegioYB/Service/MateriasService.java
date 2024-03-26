package com.example.MateriasProyectoColegioYB.Service;

import com.example.MateriasProyectoColegioYB.Models.Materias;

import java.util.List;

public interface MateriasService {
    Materias saveMaterias(Materias materias);
    List<Materias> getAllMaterias();
    Materias getMateriasById(Long materiasId);
    void deleteMaterias(Long materiasId);
}

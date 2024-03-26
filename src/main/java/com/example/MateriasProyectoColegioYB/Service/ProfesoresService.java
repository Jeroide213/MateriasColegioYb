package com.example.MateriasProyectoColegioYB.Service;

import com.example.MateriasProyectoColegioYB.Models.Profesores;

import java.util.List;

public interface ProfesoresService {
    Profesores saveProfesores(Profesores profesores);
    List<Profesores> getAllProfesores();
    Profesores getProfesoresById(Long profesoresId);
    void deleteProfesores(Long profesoresId);
}

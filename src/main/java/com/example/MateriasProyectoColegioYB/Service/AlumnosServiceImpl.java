package com.example.MateriasProyectoColegioYB.Service;

import com.example.MateriasProyectoColegioYB.Models.Alumnos;
import com.example.MateriasProyectoColegioYB.Repository.AlumnosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlumnosServiceImpl implements AlumnosService {

    @Autowired
    private AlumnosRepo alumnosRepository;

    @Override
    public Alumnos saveAlumno(Alumnos alumnos) {
        return alumnosRepository.save(alumnos);
    }

    @Override
    public List<Alumnos> getAllAlumnos() {
        return alumnosRepository.findAll();
    }

    @Override
    public Alumnos getAlumnoById(Long alumnosId) {
        return alumnosRepository.findById(alumnosId).orElse(null);
    }

    @Override
    public void deleteAlumno(Long alumnosId) {
        alumnosRepository.deleteById(alumnosId);
    }
}

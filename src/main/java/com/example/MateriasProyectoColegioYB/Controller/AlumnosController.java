package com.example.MateriasProyectoColegioYB.Controller;

import com.example.MateriasProyectoColegioYB.Models.Alumnos;
import com.example.MateriasProyectoColegioYB.Service.AlumnosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnosController {
    @Autowired
    private AlumnosService alumnosService;
    @PostMapping
    public ResponseEntity<Alumnos> saveAlumno(@RequestBody Alumnos alumnos){
        Alumnos saveAlumno = alumnosService.saveAlumno(alumnos);
        return new ResponseEntity<>(saveAlumno, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Alumnos>> getAllAlumnos(){
        List<Alumnos> alumnos = alumnosService.getAllAlumnos();
        return new ResponseEntity<>(alumnos, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Alumnos> getAlumnoById(@PathVariable("id") Long alumnosId){
        Alumnos alumnos = alumnosService.getAlumnoById(alumnosId);
        if (alumnos == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(alumnos, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAlumno(@PathVariable("id")Long alumnosId){
        alumnosService.deleteAlumno(alumnosId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

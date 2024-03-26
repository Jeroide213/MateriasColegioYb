package com.example.MateriasProyectoColegioYB.Controller;

import com.example.MateriasProyectoColegioYB.Models.Profesores;
import com.example.MateriasProyectoColegioYB.Service.ProfesoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesoresController {
    @Autowired
    private ProfesoresService profesoresService;
    @PostMapping
    public ResponseEntity<Profesores> saveProfesores(@RequestBody Profesores profesores){
        Profesores saveProfesores = profesoresService.saveProfesores(profesores);
        return new ResponseEntity<>(saveProfesores, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Profesores>> getAllProfesores(){
        List<Profesores> profesores = profesoresService.getAllProfesores();
        return new ResponseEntity<>(profesores, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Profesores> getProfesorById(@PathVariable("id") Long profesoresId){
        Profesores profesores = profesoresService.getProfesoresById(profesoresId);
        if (profesores == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(profesores, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfesores(@PathVariable("id")Long profesoresId){
        profesoresService.deleteProfesores(profesoresId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

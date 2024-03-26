package com.example.MateriasProyectoColegioYB.Controller;

import com.example.MateriasProyectoColegioYB.Models.Materias;
import com.example.MateriasProyectoColegioYB.Service.MateriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materias")
public class MateriasController {
    @Autowired
    private MateriasService materiasService;
    @PostMapping
    public ResponseEntity<Materias> saveMaterias(@RequestBody Materias materias){
        Materias saveMaterias = materiasService.saveMaterias(materias);
        return new ResponseEntity<>(saveMaterias, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Materias>> getAllMaterias(){
        List<Materias> materias = materiasService.getAllMaterias();
        return new ResponseEntity<>(materias, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Materias> getMateriasById(@PathVariable("id") Long materiasId){
        Materias materias = materiasService.getMateriasById(materiasId);
        if (materias == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(materias, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMaterias(@PathVariable("id")Long materiasId){
        materiasService.deleteMaterias(materiasId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

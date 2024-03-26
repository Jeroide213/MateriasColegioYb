package com.example.MateriasProyectoColegioYB.Controller;


import com.example.MateriasProyectoColegioYB.Models.Calificaciones;
import com.example.MateriasProyectoColegioYB.Service.CalificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {
    @Autowired
    private CalificacionesService calificacionesService;
    @PostMapping
    public ResponseEntity<Calificaciones> saveCalificaciones(@RequestBody Calificaciones calificaciones){
        Calificaciones saveCalificaciones = calificacionesService.saveCalificaciones(calificaciones);
        return new ResponseEntity<>(saveCalificaciones, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Calificaciones>> getAllCalificaciones(){
        List<Calificaciones> calificaciones = calificacionesService.getAllCalificaciones();
        return new ResponseEntity<>(calificaciones, HttpStatus.OK);
    }
    @GetMapping("/alumnos/{alumnosId}")
    public ResponseEntity<List<Calificaciones>> getCalificacionesByAlumnosId(@PathVariable("alumnosId") Long alumnoId) {
        List<Calificaciones> calificaciones = calificacionesService.getCalificacionesByAlumnosId(alumnoId);
        if (calificaciones == null || calificaciones.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(calificaciones, HttpStatus.OK);
    }
    @GetMapping("/materias/{materiasId}")
    public ResponseEntity<List<Calificaciones>> getCalificacionesByMateriaId(@PathVariable("id")Long materiasId){
        calificacionesService.getCalificacionesByMateriaId(materiasId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

package com.example.MateriasProyectoColegioYB.Controller;

import com.example.MateriasProyectoColegioYB.Models.Cursos;
import com.example.MateriasProyectoColegioYB.Service.CursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursosController {

    @Autowired
    private CursosService cursosService;

    @GetMapping("/{id}")
    public ResponseEntity<Cursos> getCursoById(@PathVariable Long id) {
        Cursos curso = cursosService.getCursoById(id);
        if (curso != null) {
            return ResponseEntity.ok(curso);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Cursos> createCurso(@RequestBody Cursos curso) {
        Cursos cursoCreado = cursosService.createCurso(curso);
        return ResponseEntity.created(URI.create("/api/cursos/" + cursoCreado.getId())).body(cursoCreado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cursos> updateCurso(@PathVariable Long id, @RequestBody Cursos curso) {
        Cursos cursoActualizado = cursosService.updateCurso(id, curso);
        if (cursoActualizado != null) {
            return ResponseEntity.ok(cursoActualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurso(@PathVariable Long id) {
        cursosService.deleteCurso(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<Cursos> getAllCursos() {
        return cursosService.getAllCursos();
    }
}

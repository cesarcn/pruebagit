package com.example.examenh93.controller;


import com.example.examenh93.entity.CursosEntity;
import com.example.examenh93.interfa.CursosInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/cursos")
public class CursosController {
    @Autowired
    private CursosInterface cursosInterface;

    @GetMapping
    public List<CursosEntity> busquedaCursos (){
        return (List<CursosEntity>) cursosInterface.findAll();
    }

    @PostMapping
    public void crearCursos (@RequestBody CursosEntity CurEnt) {
        cursosInterface.save(CurEnt);
    }

    @PutMapping
    public void actualizarCursos (@RequestBody CursosEntity CurEnt) {
        cursosInterface.save(CurEnt);
    }

    @PutMapping (value = "/{id}")
    public ResponseEntity<CursosEntity> actualizarCursos (@PathVariable ("id") Integer id, @RequestBody CursosEntity CurEntJson) {
        CursosEntity CurEntBD = cursosInterface.findById(id).orElseThrow();
        System.out.println(CurEntBD.getIdcurso());

        //NomCurso vacio
        if (!(CurEntJson.getNomcurso() == null)) {
            CurEntBD.setNomcurso(CurEntJson.getNomcurso());
        }
        //Creditos Vacio
        if (!(CurEntJson.getCreditos() == null)) {
            CurEntBD.setCreditos(CurEntJson.getCreditos());
        }
        CursosEntity CurEntBDActu = cursosInterface.save(CurEntBD);

        return ResponseEntity.ok(CurEntBDActu);
    }
}

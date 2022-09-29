package com.example.examenh93.controller;


import com.example.examenh93.entity.CursosEntity;
import com.example.examenh93.entity.MatriculaEntity;
import com.example.examenh93.interfa.CursosInterface;
import com.example.examenh93.interfa.MatriculaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/matricula")
public class MatriculaController {
    @Autowired
    private MatriculaInterface matriculaInterface;

    @GetMapping
    public List<MatriculaEntity> busquedaMatriculas (){
        return (List<MatriculaEntity>) matriculaInterface.findAll();
    }

    @PostMapping
    public void crearMatriculas (@RequestBody MatriculaEntity MatriEnt) {
        matriculaInterface.save(MatriEnt);
    }

    @PutMapping
    public void actualizarMatriculas (@RequestBody MatriculaEntity MatriEnt) {
        matriculaInterface.save(MatriEnt);
    }

    @PutMapping (value = "/{id}")
    public ResponseEntity<MatriculaEntity> actualizarMatriculas (@PathVariable ("id") Integer id, @RequestBody MatriculaEntity MatriEntJson) {
        MatriculaEntity MatriEntBD = matriculaInterface.findById(id).orElseThrow();
        System.out.println(MatriEntBD.getIdmatricula());

        //idcurso vacio
        if (!(MatriEntJson.getIdcurso() == null)) {
            MatriEntBD.setIdcurso(MatriEntJson.getIdcurso());
        }
        //idalumno Vacio
        if (!(MatriEntJson.getIdalumno() == null)) {
            MatriEntBD.setIdalumno(MatriEntJson.getIdalumno());
        }
        MatriculaEntity MatriEntBDActu = matriculaInterface.save(MatriEntBD);

        return ResponseEntity.ok(MatriEntBDActu);
    }
}

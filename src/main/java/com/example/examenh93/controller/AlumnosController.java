package com.example.examenh93.controller;

import com.example.examenh93.entity.AlumnosEntity;
import com.example.examenh93.interfa.AlumnosInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/alumnos")
public class AlumnosController {
    @Autowired
    private AlumnosInterface alumnosInterface;

    @GetMapping
    public List<AlumnosEntity> busquedaAlumnos (){
        return (List<AlumnosEntity>) alumnosInterface.findAll();
    }

    @PostMapping
    public void crearAlumnos (@RequestBody AlumnosEntity AlumEnt) {
        alumnosInterface.save(AlumEnt);
    }

    @PutMapping
    public void actualizarAlumnos (@RequestBody AlumnosEntity AlumEnt) {
        alumnosInterface.save(AlumEnt);
    }

    @PutMapping (value = "/{id}")
    public ResponseEntity<AlumnosEntity> actualizarAlumnosEspecifico (@PathVariable ("id") Integer id, @RequestBody AlumnosEntity AlumEntJson) {
        AlumnosEntity AlumEntBD = alumnosInterface.findById(id).orElseThrow();
        System.out.println(AlumEntBD.getNombalumno());

        //Apellido vacio
        if (!(AlumEntJson.getApelalumno() == null)) {
            AlumEntBD.setApelalumno(AlumEntJson.getApelalumno());
        }
        //Correo Vacio
        if (!(AlumEntJson.getCorreo() == null)) {
            AlumEntBD.setCorreo(AlumEntJson.getCorreo());
        }
        //Edad Vacio
        if (!(AlumEntJson.getEdad() == null)) {
            AlumEntBD.setEdad(AlumEntJson.getEdad());
        }

        /*//IpOrigen Vacio
        if (!(DatCliEntJson.getDniCliente() == null)) {
            DatCliEntBD.setDniCliente(DatCliEntJson.getDniCliente());
        }*/

        AlumnosEntity AlumEntBDActu = alumnosInterface.save(AlumEntBD);

        return ResponseEntity.ok(AlumEntBDActu);
    }
}

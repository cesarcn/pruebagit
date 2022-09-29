package com.example.examenh93.entity;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table ( name = "cursos")
public class CursosEntity {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column ( name = "idcurso")
    private Integer idcurso;
    @Column (name = "nomcurso")
    private String nomcurso;
    @Column (name = "creditos")
    private String creditos;

    public Integer getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public String getNomcurso() {
        return nomcurso;
    }

    public void setNomcurso(String nomcurso) {
        this.nomcurso = nomcurso;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

}

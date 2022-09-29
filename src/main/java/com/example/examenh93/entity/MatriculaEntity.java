package com.example.examenh93.entity;

import javax.persistence.*;

@Entity
@Table ( name = "matricula")
public class MatriculaEntity {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column ( name = "idmatricula")
    private Integer idmatricula;
    @Column ( name = "idcurso")
    private Integer idcurso;
    @Column ( name = "idalumno")
    private Integer idalumno;

    public Integer getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(Integer idmatricula) {
        this.idmatricula = idmatricula;
    }

    public Integer getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public Integer getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(Integer idalumno) {
        this.idalumno = idalumno;
    }
}

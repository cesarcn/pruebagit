package com.example.examenh93.entity;


import javax.persistence.*;
import java.net.InetAddress;

@Entity
@Table ( name = "alumnos")
public class AlumnosEntity {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column ( name = "idalumno")
    private Integer idalumno;
    @Column (name = "nombalumno")
    private String nombalumno;
    @Column (name = "apelalumno")
    private String apelalumno;
    @Column (name = "correo")
    private String correo;
    @Column (name = "edad")
    private Integer edad;
    @Column (name = "iporigen")
    private String iporigen = InetAddress.getLoopbackAddress().getCanonicalHostName();

    public Integer getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(Integer idalumno) {
        this.idalumno = idalumno;
    }

    public String getNombalumno() {
        return nombalumno;
    }

    public void setNombalumno(String nombalumno) {
        this.nombalumno = nombalumno;
    }

    public String getApelalumno() {
        return apelalumno;
    }

    public void setApelalumno(String apelalumno) {
        this.apelalumno = apelalumno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getIporigen() {
        return iporigen;
    }

    public void setIporigen(String iporigen) {
        this.iporigen = iporigen;
    }
}

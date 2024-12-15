package com.cibertec.proypid.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;


@Entity
@Table(name = "tb_proyecto")
public class ProyectoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProyecto")
    private Integer idProyecto;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "fechaRegistro", nullable = false)
    private LocalDate fechaRegistro;

    public ProyectoEntity() {
    }

        public ProyectoEntity(Integer idProyecto, String nombre, LocalDate fechaRegistro) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}

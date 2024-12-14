package com.cibertec.proypid.model.entity;

import jakarta.persistence.*;
import lombok.Getter;


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
    private String fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false) // Llave foránea
    private UsuarioEntity usuario; // Relación con UsuarioEntity

    public ProyectoEntity() {
    }

    public ProyectoEntity(Integer idProyecto, String nombre, String fechaRegistro, UsuarioEntity usuario) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
        this.usuario = usuario;
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

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }
}

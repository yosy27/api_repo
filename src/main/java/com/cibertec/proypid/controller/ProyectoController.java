package com.cibertec.proypid.controller;

import com.cibertec.proypid.model.entity.ProyectoEntity;
import com.cibertec.proypid.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v2")
public class ProyectoController {

    @Autowired
    private ProyectoService proyectoService;

    @PostMapping("/registrarProyecto")
    public ResponseEntity<ProyectoEntity> registrarProyecto(@RequestBody ProyectoEntity nuevoProyecto) {
        ProyectoEntity proyectoGuardado = proyectoService.registrarProyecto(nuevoProyecto);
        return ResponseEntity.status(HttpStatus.CREATED).body(proyectoGuardado);
    }

    @GetMapping("/proyectos")
    public ResponseEntity<List<ProyectoEntity>> listarProyectos(){
        List<ProyectoEntity> proyectos = proyectoService.listarProyectos();
        return ResponseEntity.ok(proyectos);
    }
}
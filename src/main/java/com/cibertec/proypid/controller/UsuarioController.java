package com.cibertec.proypid.controller;

import com.cibertec.proypid.model.entity.UsuarioEntity;
import com.cibertec.proypid.service.UsuarioService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> credentials) {
        String token = usuarioService.login(credentials.get("email"), credentials.get("password"));
        return ResponseEntity.ok(token);
    }

    @GetMapping("/dni/{dni}")
    public ResponseEntity<UsuarioEntity> buscaPorDni(@PathVariable String dni) {
        UsuarioEntity usuario = usuarioService.buscarPorDni(dni);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/correo/{correo}")
    public ResponseEntity<UsuarioEntity> buscaPorCorreo(@PathVariable String correo) {
        UsuarioEntity usuario = usuarioService.buscarPorCorreo(correo);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<UsuarioEntity> buscaPorNombre(@PathVariable String username) {
        UsuarioEntity usuario = usuarioService.buscarPorNombre(username);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    public ResponseEntity<UsuarioEntity> registrarCliente(@RequestBody UsuarioEntity nuevoUsuario) {
        UsuarioEntity usuarioGuardado = usuarioService.registrarCliente(nuevoUsuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioGuardado);
    }
}

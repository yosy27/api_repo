package com.cibertec.proypid.service.impl;

import com.cibertec.proypid.model.entity.UsuarioEntity;
import com.cibertec.proypid.repository.UsuarioRepository;
import com.cibertec.proypid.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public UsuarioEntity buscarPorDni(String dni) {
        return usuarioRepository.findByDni(dni)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con DNI: " + dni));
    }

    @Override
    public UsuarioEntity buscarPorCorreo(String correo) {
        return usuarioRepository.findByEmail(correo)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con correo: " + correo));
    }

    @Override
    public UsuarioEntity buscarPorNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con nombre: " + nombre));
    }

    @Override
    public UsuarioEntity registrarCliente(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);

    }

    @Override
    public String login(String email, String password) {
        UsuarioEntity usuario = usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Correo no encontrado"));
        if (!usuario.getPassword().equals(password)) {
            throw new RuntimeException("Contraseña incorrecta");
        }
        // Simulación de generación de token (puedes usar JWT)
        return "Bearer " + UUID.randomUUID();
    }

    @Override
    public List<UsuarioEntity> listarTodos() {
        return usuarioRepository.findAll();
    }


}

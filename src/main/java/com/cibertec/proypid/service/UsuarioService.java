package com.cibertec.proypid.service;

import com.cibertec.proypid.model.entity.UsuarioEntity;

import java.util.List;

public interface UsuarioService {

    UsuarioEntity buscarPorDni(String dni);

    UsuarioEntity obtenerUsuarioPorId(Integer idUsuario);

    UsuarioEntity buscarPorCorreo(String correo);

    UsuarioEntity buscarPorNombre(String nombre);

    UsuarioEntity registrarCliente(UsuarioEntity usuario);

    String login(String email, String password);

    List<UsuarioEntity> listarTodos();

}

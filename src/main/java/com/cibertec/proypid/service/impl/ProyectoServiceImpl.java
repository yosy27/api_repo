package com.cibertec.proypid.service.impl;

import com.cibertec.proypid.model.entity.ProyectoEntity;
import com.cibertec.proypid.model.entity.UsuarioEntity;
import com.cibertec.proypid.repository.ProyectoRepository;
import com.cibertec.proypid.repository.UsuarioRepository;
import com.cibertec.proypid.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProyectoServiceImpl implements ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;


    @Override
    public ProyectoEntity registrarProyecto(ProyectoEntity proyecto) {
        proyecto.setFechaRegistro(LocalDate.now());
        return proyectoRepository.save(proyecto);
    }

    @Override
    public List<ProyectoEntity> listarProyectos() {
        return proyectoRepository.findAll();
    }


}

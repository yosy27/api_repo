package com.cibertec.proypid.service;


import com.cibertec.proypid.model.entity.ProyectoEntity;
import com.cibertec.proypid.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ProyectoService {


    ProyectoEntity registrarProyecto(ProyectoEntity proyecto);

    List<ProyectoEntity> listarProyectos();

}

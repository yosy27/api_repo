package com.cibertec.proypid.service;


import com.cibertec.proypid.model.entity.ProyectoEntity;

import java.util.List;

public interface ProyectoService {

    ProyectoEntity registrarProyecto(ProyectoEntity proyecto);

    List<ProyectoEntity> listarProyectos();

}

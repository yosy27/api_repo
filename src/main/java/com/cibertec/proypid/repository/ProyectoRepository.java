package com.cibertec.proypid.repository;

import com.cibertec.proypid.model.entity.ProyectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<ProyectoEntity, Integer> {
    boolean existsByNombre(String nombre);
}

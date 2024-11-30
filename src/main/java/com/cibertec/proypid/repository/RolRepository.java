package com.cibertec.proypid.repository;

import com.cibertec.proypid.model.entity.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<RolEntity, Long> {
    Optional<RolEntity> findByNombreRol(String nombreRol);
}

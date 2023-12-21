package com.pinglo.sisgestion.repositiry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arcila.sistemaalmacen.entity.Articulo;

@Repository
public interface InfraccionRepository extends JpaRepository<Infraccion, Integer> {
	List<Infraccion> findByNombreContaining(String texto);
	Infraccion findByNombre(String texto);
}

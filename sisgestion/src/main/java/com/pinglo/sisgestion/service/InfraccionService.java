package com.pinglo.sisgestion.service;
import com.pinglo.sisgestion.entity.Infraccion;
import java.util.List;

import org.springframework.stereotype.Service;

public interface InfraccionService {
	public List<Infraccion> findAll();
	public Infraccion findById(int id);
	public Infraccion findBydni(String dni);
	public List<Infraccion> findBydniContaining(String dni);
	public Infraccion findByFecha(String fecha);
	public List<Infraccion> findByFechaContaining(String fecha);
	public Infraccion findByPlaca(String placa);
	public List<Infraccion> findByPlacaContaining(String placa);
	public Infraccion findByInfraccion(String infraccion);
	public List<Infraccion> findByInfraccionContaining(String infraccion);
	public Infraccion create(Infraccion obj);
	public Infraccion update(Infraccion obj);
	public int delete(int id);
}

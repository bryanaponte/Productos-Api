package pe.edu.aponte.productosapi.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.aponte.productosapi.models.Producto;
import pe.edu.aponte.productosapi.repositories.ProductoRepository;


@Service
public class ProductoService {
	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> listar(){
		return productoRepository.listar();
	}

}

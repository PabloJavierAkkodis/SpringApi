package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Producto;
import com.example.demo.services.ProductoService;

@RestController
@RequestMapping("productos")
public class ProductoController {

	@Autowired
	ProductoService productoService;
	
	
	@PutMapping()
	public Producto crearProducto(@RequestBody Producto prod) {
		
		
		return productoService.crearProducto(prod);
	}
	
	
	
	@GetMapping( path = "/{id}" )
	public Producto buscarProducto(@PathVariable Long id) {
		return productoService.buscarProducto(id);
	}
	
	@PostMapping
	public Producto actualizaProducto(@RequestBody Producto prod) {
		return productoService.actualizaProducto(prod);
	}
	
	@DeleteMapping (  path = "/{id}"  )
	public void borrarProducto(@PathVariable Long id) {
		productoService.borrarProducto(id);
		
	}
	
	
	@GetMapping()
	public ArrayList<Producto> obtenerProductos(){
		return productoService.obtenerProductos();
	}
	
	
	
}

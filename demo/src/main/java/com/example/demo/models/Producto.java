package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
	
	@Entity
	@Table(name = "productos")
public class Producto {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(unique = true, nullable = false)
		private Long id;
		
		@Column(name = "nombre")
		private String nombre;
		
		@Column(name = "descripcion")
		private String descripcion;
		
		@Column(name = "precio")
		private double precio;
		
		@Column(name = "cantidad_disponible")
		private int disponible;


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public int getCantidadDisponible() {
			return disponible;
		}

		public void setCantidadDisponible(int cantidadDisponible) {
			this.disponible = cantidadDisponible;
		}

}

package com.edp.proyectoTienda.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id_cliente")
   private Integer idCliente;

   private String nombre;

   private String apellido;

   private Double celular;

   private String direccion;

   @Column(name= "correo_electronico")
   private String correoElectronico;

   @OneToMany(mappedBy = "cliente")
   private List<Compra> compras;

   public Integer getIdCliente() {
      return idCliente;
   }

   public void setIdCliente(Integer idCliente) {
      this.idCliente = idCliente;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public Double getCelular() {
      return celular;
   }

   public void setCelular(Double celular) {
      this.celular = celular;
   }

   public String getDireccion() {
      return direccion;
   }

   public void setDireccion(String direccion) {
      this.direccion = direccion;
   }

   public String getCorreoElectronico() {
      return correoElectronico;
   }

   public void setCorreoElectronico(String correoElectronico) {
      this.correoElectronico = correoElectronico;
   }

   public List<Compra> getCompras() {
      return compras;
   }

   public void setCompras(List<Compra> compras) {
      this.compras = compras;
   }
}

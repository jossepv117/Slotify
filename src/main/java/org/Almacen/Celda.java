package org.Almacen;

import org.Catalogo.Producto;

public class Celda {
  private Producto producto;
  private EstadoProducto estado;

  public Celda(EstadoProducto estado) {
    this.estado = estado;
  }

  public Celda(Producto producto, EstadoProducto estado) {
    this.producto = producto;
    this.estado = estado;
  }

  public Producto getProducto() {
    return producto;
  }

  public EstadoProducto getEstado() {
    return estado;
  }

  public void setEstado(EstadoProducto nuevoEstado) {
    this.estado = nuevoEstado;
  }

  public void setProducto(Producto nuevoProducto) {
    this.producto = nuevoProducto;
  }
}

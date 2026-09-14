package org.Almacen;

import org.Catalogo.Producto;

public class Celda {
  private Producto producto;
  private EstadoProducto estado;

  public Celda(Producto producto, EstadoProducto estado) {
    this.producto = producto;
    this.estado = estado;
  }

  public Producto getProducto() {
    return producto;
  }

}

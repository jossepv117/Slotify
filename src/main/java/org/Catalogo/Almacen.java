package org.Catalogo;

public class Almacen {

  private static Almacen INSTANCIA;
  private int filas;
  private int columnas;
  private Producto[][] almacen;

  private Almacen(int filas, int columnas) {
    this.filas = filas;
    this.columnas = columnas;
    almacen = new Producto[filas][columnas];
  }

  public static Almacen getInstancia(int filas, int columnas) {
    if (INSTANCIA == null) {
      INSTANCIA = new Almacen(filas, columnas);
    }

    return INSTANCIA;
  }

  public static Almacen getInstancia() {
    if (INSTANCIA == null) {
      System.out.println("PRIMERO DEBES INICIALIZAR EL ALMACEN");
      return null;
    } else {
      return INSTANCIA;
    }
  }
}

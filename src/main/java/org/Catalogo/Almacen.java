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

  public void agregarProducto(int fila, int columna, Producto Producto) {
    almacen[fila][columna] = Producto;
  }

  public void construirAlmacen(int fila, int columnas, int numeroPasillos) {
    int columnasDisponibles = columnas - 1;
    int filasDisponibles = filas - 1;

    // crear pasillos y paredes

    for (int i = 0; i < almacen.length; i++) {
      for (int j = 0; i < almacen[i].length; j++) {
        if (i == 0 || i == almacen.length - 1 || j == 0 || j == almacen[i].length - 1) {
          almacen[i][j] = 0;
        }
      }
    }
  }
}

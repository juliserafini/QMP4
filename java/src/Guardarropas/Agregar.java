package Guardarropas;

import Prenda.Prenda;

public class Agregar implements Solicitud{
  private Prenda prenda;
  private Guardarropas guardarropa;
  public void implementarSegunSolicitud(Guardarropas guardarropa) {
    if (guardarropa.duenio.criterioParaAcepptarPrenda(prenda)) {
      guardarropa.listaDePrendasParaDeterminadoGuardarropas.add(prenda);
    }
  }

  public Prenda getPrenda() {
    return prenda;
  }
}

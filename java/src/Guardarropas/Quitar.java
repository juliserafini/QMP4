package Guardarropas;

import Prenda.Prenda;

public class Quitar implements Solicitud{
  private Prenda prenda;
  private Guardarropas guardarropa;
  public void implementarSegunSolicitud(Guardarropas guardarropa) {
    if (!guardarropa.duenio.criterioParaAcepptarPrenda(prenda)) {
      guardarropa.listaDePrendasParaDeterminadoGuardarropas.remove(prenda);
    }
  }
  public Prenda getPrenda() {
    return prenda;
  }
}

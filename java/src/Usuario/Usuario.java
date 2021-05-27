package Usuario;

import Guardarropas.*;
import Prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private Guardarropas miGuardarropas;
 // private List<Prenda> prendasAceptadas = new ArrayList<Prenda>();

  //public boolean aceptarPrenda(Prenda prenda){
  //  return prendasAceptadas.contains(prenda);
 // }

  public boolean criterioParaAcepptarPrenda(Prenda prenda){

  }

  public void deshacerSolicitud(Solicitud soli){
    miGuardarropas.deshacerSolicitud(soli);
  }
}

package Personas;

import Clima.*;
import Clima.ServicioMeteorologico;
import Guardarropas.*;
import Prenda.Prenda;

import java.util.List;

public class Usuario {
  private Guardarropas miGuardarropas;
  private List<Prenda> listaDiariaDeSugerencias;
  private String email;

 // private List<Prenda> prendasAceptadas = new ArrayList<Prenda>();

  //public boolean aceptarPrenda(Prenda prenda){
  //  return prendasAceptadas.contains(prenda);
 // }

  public String getEmail() {
    return email;
  }

  public boolean criterioParaAcepptarPrenda(Prenda prenda){
  }

  public void hacerModificacion(Solicitud soli){
    miGuardarropas.hacerModificacion(soli);
  }

  public void cargarSugerencias(List <Prenda> lista){
    listaDiariaDeSugerencias.addAll(lista);
  }

  public List<Prenda> getListaDiariaDeSugerencias() {
    return listaDiariaDeSugerencias;
  }

  public void deshacerSolicitud(Solicitud soli){
    miGuardarropas.deshacerSolicitud(soli);
  }

  public List<String> informarsePaginaUltimasAlertas(ServicioMeteorologico servicio){
    return servicio.getAlertasPublicadas();
  }


}

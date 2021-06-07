package Personas;
import Clima.*;
import Mail.ServicioMail;
import Prenda.Prenda;
import Sugerencias.*;

import java.util.List;

public class Empleado {
  private Sugerencia sugerencia;
  private List<Usuario> usuarios;
  private List<Prenda> lista;
  //private Clima clima;



  public void setSugerencia(Sugerencia sugerencias){
    this.sugerencia = sugerencias;
  }

  public void sugerirleAUnUsuario(){
       lista = sugerencia.sugerir();
       cargarListaDeSugerenciasDiarias(lista);
  }

  public void cargarListaDeSugerenciasDiarias(List<Prenda> lista){
    usuarios.stream().forEach(usuario -> usuario.cargarSugerencias(lista));
  }

  public void terminarDia(){
    usuarios.stream().forEach(usuario -> usuario.getListaDiariaDeSugerencias().clear());
  }

  public void enviarMail(Clima climaNuevaAlerta) {
    //if (ServicioMeteorologico.isHayAlertaNueva()) {
      usuarios.forEach(usuario -> ServicioMail.enviar("Se genero una nueva alerta:" + climaNuevaAlerta.getAlertas(), usuario.getEmail()));
   // }
  }

}

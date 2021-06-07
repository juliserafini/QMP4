package Clima;

import ServicioNotificacion.NotificacionServicio;

import java.util.List;

public class NotificacionEvitarSalirAuto implements ObserverAlert{

  public void recibirAlertas(List<String> alertas) {
    if(this.granizo(alertas))
      NotificacionServicio.notificar("Se le recomienda no salir con el auto, va a haber GRANIZOOOO!!:(");
  }

  private boolean granizo(List<String> alertas) {
    return alertas.contains("HAIL");
  }
}

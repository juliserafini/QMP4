package Clima;

import java.util.List;
import ServicioNotificacion.NotificacionServicio;

public class NotificacionLlevarParaguas {

  public void recibirAlertas(List<String> alertas) {
    if(this.tormenta(alertas))
      NotificacionServicio.notificar("Se le recomienda salir con paraguas, va a haber una re TORMENTAAA!!:(");
  }

  private boolean tormenta(List<String> alertas) {
    return alertas.contains("STORM");
  }
}

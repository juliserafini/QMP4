package Clima;

import java.util.List;
import java.util.Map;

public class Clima {
  AccuWeatherAPI apiClima = new AccuWeatherAPI();
  List<Map<String, Object>> condicionesClimaticas;

  public Integer condicionesClimaticas(){
    return (Integer) condicionesClimaticas.get(0).get("Temperature");
  }
  public void setApiClimaBuenosAires() {
    apiClima.getWeather("Buenos Aires, Argentina");
  }

//Los dos ultimos requerimientos no los se hacer

}

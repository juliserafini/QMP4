package Sugerencias;

import Clima.Clima;
import Prenda.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class Sugerencia {

  List<Prenda> partesSuperiores = new ArrayList<Prenda>();
  List<Prenda> partesInferiores= new ArrayList<Prenda>();
  List<Prenda> calzados = new ArrayList<Prenda>();
  List<Prenda> accesorios = new ArrayList<Prenda>();
  Clima climaReciente;

  public void climaActual(Clima climaReciente){
    this.climaReciente = climaReciente;
  }

  public Prenda sugerirParteSup(){
    return partesInferiores.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
  }


  public Prenda sugerirParteInf(){
    return partesInferiores.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
  }

  public Prenda sugerirCalzado(){
    return calzados.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
  }

  public Prenda sugerirAccesorio(){
    return accesorios.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
  }



}

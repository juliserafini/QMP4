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
    this.agregarPartesSuperiores();
    return partesInferiores.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
  }

  protected abstract void agregarPartesSuperiores();

  public Prenda sugerirParteInf(){
    this.agregarPartesInferiores();
    return partesInferiores.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
  }

  protected abstract void agregarPartesInferiores();

  public Optional<Prenda> sugerirCalzado(){
    this.agregarCalzados();
    return calzados.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
  }

  protected abstract void agregarCalzados();

  public Prenda sugerirAccesorio(){
    this.agregarAccesorios();
    return accesorios.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
  }

  protected abstract void agregarAccesorios();

}

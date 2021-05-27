package Guardarropas;

import Prenda.Caracteristica;
import Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GuardarropasCompartido extends Guardarropas{
  List<Usuario> usuarios = new ArrayList<Usuario>();

  GuardarropasCompartido(Caracteristica tipoDeRopa, List<Usuario> usuarios) {
    super(tipoDeRopa);
    this.usuarios = usuarios;
  }
}

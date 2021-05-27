package Prenda;

public class Prenda {
  private TipoDePrenda tipoDeLaPrenda;
  private Color color;
  private TipoMaterial tipomaterial;
  private Color colorSecundario;
  private Trama trama;
  private Caracteristica carac;

  public Prenda(TipoDePrenda tipoPrenda, TipoMaterial material, Color color, Trama trama, Caracteristica carac) {
    this.tipoDeLaPrenda = tipoPrenda;
    this.color = color;
    this.tipomaterial = material;
    this.trama = trama;
    this.carac = carac;
  }

  public Prenda(TipoDePrenda tipoPrenda,TipoMaterial material, Color color, Color colorSecundario, Trama trama, Caracteristica carac) {
    this.tipoDeLaPrenda = tipoPrenda;
    this.color = color;
    this.tipomaterial = material;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
    this.carac = carac;
  }

  public boolean sePuedeUsarSegunClima(Integer temperatura){
   return tipoDeLaPrenda.estaDentroDeTempAdecuada(temperatura);
  }

  public Caracteristica getCarac() {
    return carac;
  }
}

package Prenda;

import java.awt.*;
import java.util.Arrays;


public enum TipoDePrenda {
    REMERA {
      //Cada tipo tiene una lista de que materiales se les permite
      @Override
      public Categoria getCategoria() {
        return Categoria.PARTESUPERIOR;
      }

      public List<TipoMaterial> tipoMaterialPrenda() {
        return Arrays.asList(TipoMaterial.ALGODON ,TipoMaterial.JEAN, TipoMaterial.LYCRA);
      }

      @Override
      public Integer temperaturaMAXAdecuada() {
        return 20;
      }
    },
    PANTALON {
      @Override
      public Categoria getCategoria() {
        return Categoria.PARTEINFERIOR;
      }

      public List<TipoMaterial> tipoMaterialPrenda() {
        return Arrays.asList(TipoMaterial.CUERO,TipoMaterial.JEAN, TipoMaterial.ALGODON);
      }

      @Override
      public Integer temperaturaMAXAdecuada() {
        return 17;
      }
    },
    ZAPATILLA {
      @Override
      public Categoria getCategoria() {
        return Categoria.CALZADO;
      }

      public List<TipoMaterial> tipoMaterialPrenda() {
        return Arrays.asList(TipoMaterial.CUERO, TipoMaterial.JEAN);
      }

      @Override
      public Integer temperaturaMAXAdecuada() {
        return 40;
      }
    },

   /*CAMISA {
     @Override
     public Categoria getCategoria() {
      return Categoria.PARTESUPERIOR;
      }

    public List<TipoMaterial> tipoMaterialPrenda() {
      return Arrays.asList(TipoMaterial.JEAN, TipoMaterial.ALGODON, TipoMaterial.LYCRA);
    }

    @Override
    public Integer temperaturaMAXAdecuada() {
      return 20;
    }
  },*/


  GORRO {
      @Override
      public Categoria getCategoria() {
        return Categoria.ACCESORIO;
      }

      public List<TipoMaterial> tipoMaterialPrenda() {
        return Arrays.asList(TipoMaterial.ALGODON, TipoMaterial.LANA);
      }

      @Override
      public Integer temperaturaMAXAdecuada() {
        return 10;
      }
    };

    //Cad una implementa un metodo abstracto que me devuelv la categoria
    public abstract Categoria getCategoria();

    public boolean materialPosible(TipoMaterial material) {
      return this.tipoMaterialPrenda().contains(material);
    }

    protected abstract List<TipoMaterial> tipoMaterialPrenda();

    public abstract Integer temperaturaMAXAdecuada();

    public boolean estaDentroDeTempAdecuada(Integer temperatura){
      return this.temperaturaMAXAdecuada() < temperatura;
    }

  }




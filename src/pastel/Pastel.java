/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastel;

/**
 *
 * @author Lucho
 */
public class Pastel {
        private  final String sabor;
        private  final String tamanio;
        private  double precio;
        private int porciones;
        private String tipo;

    public Pastel(PastelBuilder builder) {
        this.sabor = builder.sabor;
        this.tamanio = builder.tamanio;
        this.precio = builder.precio;
        this.porciones = builder.porciones;
        this.tipo = builder.tipo;
    }

    public String getSabor() {
        return sabor;
    }

    public String getTamanio() {
        return tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public int getPorciones() {
        return porciones;
    }

    public String getTipo() {
        return tipo;
    }
        
        


    
    public static  class PastelBuilder {
        private   final String sabor;
        private  final String tamanio;
        private  double precio;
        private int porciones;
        private String tipo;

        public PastelBuilder(String sabor, String tamanio) {
            this.sabor = sabor;
            this.tamanio = tamanio;
        }
    
        public PastelBuilder precio(double precio){
            this.precio= precio;
            return this;
        }
        public PastelBuilder porciones(int porciones){
            this.porciones= porciones;
            return this;
        }
        public PastelBuilder tipo(String tipo){
            this.tipo= tipo;
            return this;
        }
        
        public Pastel build(){
            return new Pastel(this);
        }


        

        
    }
            @Override
        public String toString() {
            return "PastelBuilder{" + "sabor=" + sabor + ", tamanio=" + tamanio + ", precio=" + precio + ", porciones=" + porciones + ", tipo=" + tipo + '}';
        }
        
        
    
}

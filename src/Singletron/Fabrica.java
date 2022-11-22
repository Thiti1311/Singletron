package Singletron;

import java.util.ArrayList;

import Figuras.*;

public class Fabrica {
    
    private static Fabrica instanciaUnica = null;

    private ArrayList<Quadrado> quadrados = null; 

    private Fabrica(){}

    public static Fabrica getInstance(){

        if ( instanciaUnica == null ){
            instanciaUnica = new Fabrica();
        }

        return instanciaUnica;
    }

    public Circulo getCirculo() {

        return Circulo.getInstance();
    }

    public TrianguloIsoceles getTrianguloIsoceles() {

        return TrianguloIsoceles.getInstance();
    }

    public TrianguloEquilatero getTrianguloEquilatero() {
        
        return TrianguloEquilatero.getInstance();
    }

    public TrianguloRetangulo getTrianguloRetangulo() {

        return TrianguloRetangulo.getInstance();
    }

    public ArrayList<Quadrado> getQuadrados() {

        if ( quadrados == null ){
            quadrados = new ArrayList<Quadrado>();
            quadrados.add(new Quadrado());
        }
       
        return quadrados;
    }

    public Quadrado getUmQuadrados(int index) {
        if ( quadrados.get(index) == null ){
            quadrados.add(new Quadrado());
        }
        return quadrados.get(index);
    }

    public void setUmQuadrados(double lado) {
        quadrados.add(new Quadrado(lado));
  
    }

    
}

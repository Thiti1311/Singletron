package Figuras;

public class TrianguloEquilatero implements FiguraGeometrica{

    private double lado;
    
    private static TrianguloEquilatero triangulo = null;

    public static TrianguloEquilatero getInstance(){

        if ( triangulo == null ){
            triangulo = new TrianguloEquilatero();
        }

        return triangulo;
    }

    private TrianguloEquilatero(double lado){
        this.lado = lado;
    }

    private TrianguloEquilatero() {
    }

    @Override
    public double getArea() {
        return ((lado*lado) * Math.sqrt(3))/4;
    }

    @Override
    public double getPerimetro() {
        return 3*lado;
    }

    @Override
    public String desenharFigura() {
        return "Desenhando um Triangulo Equilatero";
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Triangulo Equilatero [\nLado: "+ getLado() + "\nArea: "+ getArea() + "\nPerimetro: "+ getPerimetro() + " ]";
    }

}

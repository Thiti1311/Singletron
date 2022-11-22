package Figuras;

public class Quadrado implements FiguraGeometrica {

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public Quadrado() {
    }

    @Override
    public double getArea() {
        double area = lado*lado;
        return area;
    }

    @Override
    public double getPerimetro() {
        double perimetro = 4*lado;
        return perimetro;
    }

    @Override
    public String desenharFigura() {
        return "Desenhando um Quadrado";
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "\nQuadrado: [\nLado: "+ getLado() + "\nArea: "+ getArea() + "\nPerimetro: "+ getPerimetro() + " ]";
    }
    
}

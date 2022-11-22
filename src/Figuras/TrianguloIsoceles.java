package Figuras;

public class TrianguloIsoceles implements FiguraGeometrica{

    private double lado;
    private double base;

    private static TrianguloIsoceles triagulo = null;

    public static TrianguloIsoceles getInstance(){

        if ( triagulo == null ){
            triagulo = new TrianguloIsoceles();
        }

        return triagulo;
    }

    private TrianguloIsoceles(double lado, double base){
        this.lado = lado;
        this.base = base;
    }

    private TrianguloIsoceles() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        double altura = Math.sqrt((lado*lado) - ((base*base)/4));
        return (base*altura)/2;
    }

    @Override
    public double getPerimetro() {
        return (2*lado)+base;
    }

    @Override
    public String desenharFigura() {
        return "Desenhando um Triangulo Isoceles";
    }

    @Override
    public String toString() {
        return "Triangulo Isoceles [\nLado: "+ getLado() + "\nBase "+getBase()+ "\nArea: "+ getArea() + "\nPerimetro: "+ getPerimetro() + " ]";
    }
    
}
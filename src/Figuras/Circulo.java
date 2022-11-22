package Figuras;

public class Circulo implements FiguraGeometrica{
    
    private double raio;

    private static Circulo circulo = null;

    public static Circulo getInstance(){

        if ( circulo == null ){
            circulo = new Circulo();
        }

        return circulo;
    }

    private Circulo(double raio){
        this.raio = raio;
    }

    private Circulo() {
    }

    @Override
    public double getArea() {

        if ( circulo == null ){
            circulo = new Circulo();
        }
        double area = 3.14 * (raio*raio);
        return area;
    }

    @Override
    public double getPerimetro() {

        if ( circulo == null ){
            circulo = new Circulo();
        }

        double perimetro = 2 * 3.14 * raio;
        return perimetro;
    }

    @Override
    public String desenharFigura() {
        return "Desenhando um Circulo";
    }

    public double getRaio() {
        if ( circulo == null ){
            circulo = new Circulo();
        }
        return raio;
    }

    public void setRaio(double raio) {
        if ( circulo == null ){
            circulo = new Circulo(raio);
        }
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo: [\nRaio: "+ getRaio() + "\nArea: "+ getArea() + "\nPerimetro: "+ getPerimetro() + " ]";
    }
    
}

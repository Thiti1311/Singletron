package Figuras;

public class TrianguloRetangulo implements FiguraGeometrica{
    
    private double altura;
    private double base;

    private static TrianguloRetangulo triagulo = null;

    public static TrianguloRetangulo getInstance(){

        if ( triagulo == null ){
            triagulo = new TrianguloRetangulo();
        }

        return triagulo;
    }

    private TrianguloRetangulo(double altura, double base){
        this.altura = altura;
        this.base = base;
    }

    private TrianguloRetangulo() {
    }

    @Override
    public double getArea() {
        return (base*altura)/2;
    }

    @Override
    public double getPerimetro() {
        double hipotenusa = Math.sqrt((altura*altura) + (base*base));
        return altura+base+hipotenusa;
    }

    @Override
    public String desenharFigura() {
        return "Desenhando um Triangulo Retangulo";
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangulo Retangulo [\nBase: "+ getBase() + "\nAltura "+getAltura()+ "\nArea: "+ getArea() + "\nPerimetro: "+ getPerimetro() + " ]";
    }
}
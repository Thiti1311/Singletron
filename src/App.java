import Singletron.Fabrica;

public class App {
    public static void main(String[] args) {

        Fabrica fabrica = Fabrica.getInstance();

        System.out.println("Figuras sem valores atribuidos: ");
        System.out.println(fabrica.getCirculo());
        System.out.println("");
        System.out.println(fabrica.getTrianguloEquilatero());
        System.out.println("");
        System.out.println(fabrica.getTrianguloIsoceles());
        System.out.println("");
        System.out.println(fabrica.getTrianguloRetangulo());
        System.out.println("");
        System.out.println("Quadrados: " + fabrica.getQuadrados());
        System.out.println("");
    
        fabrica.setCirculo(4);
        fabrica.setTrianguloEquilatero(3);
        fabrica.setTrianguloIsoceles(3, 1);
        fabrica.setTrianguloRetangulo(3, 6);
        fabrica.getUmQuadrados(0).setLado(1);
        fabrica.setUmQuadrados(2);
        fabrica.setUmQuadrados(3);
        fabrica.setUmQuadrados(4);

        System.out.println("Figuras com valores setados: ");
        System.out.println(fabrica.getCirculo());
        System.out.println("");
        System.out.println(fabrica.getTrianguloEquilatero());
        System.out.println("");
        System.out.println(fabrica.getTrianguloIsoceles());
        System.out.println("");
        System.out.println(fabrica.getTrianguloRetangulo());
        System.out.println("");
        System.out.println("Quadrados: " + fabrica.getQuadrados());
        System.out.println("");
    }
}

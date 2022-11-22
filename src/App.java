import Figuras.*;
 
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
    
        Circulo.getInstance().setRaio(4);
        TrianguloEquilatero.getInstance().setLado(3);
        TrianguloIsoceles.getInstance().setBase(1);
        TrianguloIsoceles.getInstance().setLado(3);
        TrianguloRetangulo.getInstance().setAltura(3);
        TrianguloRetangulo.getInstance().setBase(6);
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

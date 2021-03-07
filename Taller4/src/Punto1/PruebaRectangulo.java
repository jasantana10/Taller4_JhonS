
package Punto1;


public class PruebaRectangulo
{
    public static void main(String[] args)
    {
        //PRUEBA CON DOS RECTANGULOS
        Rectangulo r = new Rectangulo();
        Rectangulo r1 = new Rectangulo();
        
        r.setLongitud(10);
        r.setAncho(30);
        r1.setLongitud(15);
        r1.setAncho(40);
        System.out.println("Ancho: " + r.getAncho());
        System.out.println("Longitud: " + r.getLongitud());
        System.out.println("Area de rectangulo: " + r.calcularArea());
        System.out.println("Perimetro del rectangulo: " + r.calcularPerimetro());
        
        System.out.println("Ancho: " + r1.getAncho());
        System.out.println("Longitud: " + r1.getLongitud());
        System.out.println("Area de rectangulo: " + r1.calcularArea());
        System.out.println("Perimetro del rectangulo: " + r1.calcularPerimetro());
    }
}

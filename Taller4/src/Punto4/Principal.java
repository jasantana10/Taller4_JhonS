
package Punto4;


public class Principal
{
    public static void main(String[] args)
    {
        Bicicleta b = new Bicicleta();
        
        System.out.println("Velocidad Actual: " + b.getVelocidadActual());
        System.out.println("Acelerar: " + b.Acelerar());
        System.out.println("Frenar: " + b.Frenar());
        System.out.println("Plato Actual: " + b.getPlatoActual());
        System.out.println("Cambio Plato: " + b.CambiarPlato(35));
        System.out.println("Piñon Actual: " + b.getPiñonActual());
        System.out.println("Cambio Piñon: " + b.CambiarPiñon(15));
    }
}

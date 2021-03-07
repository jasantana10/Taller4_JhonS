
package Punto2;


public class PruebaCoche
{
    public static void main(String[] args)
    {
        Coche c = new Coche();
        Coche c1 = new Coche();
        Coche c2 = new Coche();
        
        //c.setColor("Rojo");
        c1.setColor("Verde");
        c2.setColor("Amarillo");
        
        System.out.println("Color: " + c.getColor());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Color: " + c2.getColor());
    }
}

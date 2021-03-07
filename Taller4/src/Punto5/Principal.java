
package Punto5;


public class Principal
{
    public static void main(String[] args)
    {
        Producto p = new Producto();
        
        String [] Productos = {"Mesa","Silla","Cama","Televisor","Abanico"};
        for (int i = 0; i < Productos.length; i++)
        {
            System.out.println("Productos: " + Productos[i] +"\n"+ p.PrecioVenta(i));
        }
    }
}

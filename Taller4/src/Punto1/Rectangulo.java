
package Punto1;


public class Rectangulo
{
    private double longitud;
    private double ancho;
    
    public Rectangulo()
    {
        this.longitud=0;
        this.ancho=0;
    }

    public double getLongitud()
    {
        return longitud;
    }

    public void setLongitud(double longitud)
    {
        this.longitud = longitud;
    }

    public double getAncho()
    {
        return ancho;
    }

    public void setAncho(double ancho)
    {
        this.ancho = ancho;
    }
    
    public double calcularArea()
    {
       return this.ancho * this.longitud;
    }
    
    public double calcularPerimetro()
    {
        return 2 * (this.ancho+this.longitud);
    }
}

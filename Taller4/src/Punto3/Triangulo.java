
package Punto3;

public class Triangulo
{
    private double base;
    private double altura;
    
    public Triangulo()
    {
        
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    
    public double calcularArea()
    {
       return this.base * this.altura / 2;
    }
    
    public double calcularLadosIgules(double x, double z)
    {
       x = Math.pow((this.base / 2),2) + Math.pow(this.altura, 2);
       z= Math.sqrt(x);
       return z;
    }
    
    public double calcularPerimetro(double x, double z, double p)
    {
       x = Math.pow((this.base / 2),2) + Math.pow(this.altura, 2);
       z = Math.sqrt(x);
       p = (z * 2)+ this.base;
       return p;
    }
}

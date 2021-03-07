
package Punto9;


public class Fraccion
{
    private int numerador;
    private int denominador;
    
    public Fraccion()
    {
        this.numerador = 5;
        if (this.denominador == 0)
        {
            this.denominador = 1;
        }
        this.denominador = 3;
    }

    public int getNumerador()
    {
        return numerador;
    }

    public void setNumerador(int numerador)
    {
        this.numerador = numerador;
    }

    public int getDenominador()
    {
        return denominador;
    }

    public void setDenominador(int denominador)
    {
        this.denominador = denominador;
    }
    
    public Fraccion SumarFraccion(Fraccion f)
    {
        Fraccion fra = new Fraccion();
        fra.numerador = this.numerador * f.denominador + this.denominador * f.numerador;
        fra.denominador = this.denominador * f.denominador;
        fra.SimplificarFraccion();                                                 
        return fra;
    }
    
    public Fraccion RestarFraccion(Fraccion f)
    {
        Fraccion fra = new Fraccion();
        fra.numerador = this.numerador * f.denominador - this.denominador * f.numerador;
        fra.denominador = this.denominador * f.denominador;
        fra.SimplificarFraccion();
        return fra;
    }
   
    public Fraccion MultiplicarFraccion(Fraccion f)
    {
        Fraccion fra = new Fraccion();
        fra.numerador = this.numerador * f.numerador;
        fra.denominador = this.denominador * f.denominador;
        fra.SimplificarFraccion();
        return fra;
    }
    
    public Fraccion DividirFraccion(Fraccion f)
    {
        Fraccion fra = new Fraccion();
        fra.numerador = this.numerador * f.denominador;
        fra.denominador = this.denominador * f.numerador;
        fra.SimplificarFraccion();
        return fra;
    }
    
    private int mcd()
    {
        int u = Math.abs(numerador);
        int v = Math.abs(denominador);
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    private void SimplificarFraccion()
    {
        int n = mcd();
        numerador = numerador / n;
        denominador = denominador / n;
    }
    
    
    public String toString() {
        SimplificarFraccion();
        return numerador + "/" + denominador;
    }
    
    public Fraccion ImprimirFraccion(Fraccion f)
    {
        Fraccion fr1 = new Fraccion();
        Fraccion fr2 = new Fraccion();
        
        fr1.setNumerador(8);
        fr1.setDenominador(3);
        fr2.setNumerador(4);
        fr2.setDenominador(6);
        
        Fraccion suma = fr1.SumarFraccion(fr2);
        Fraccion resta = fr1.RestarFraccion(fr2);
        Fraccion multiplicacion = fr1.MultiplicarFraccion(fr2);
        Fraccion divicion = fr1.DividirFraccion(fr2);
        
        System.out.println(fr1 + " + " + fr2 + " = " + suma);
        System.out.println(fr1 + " - " + fr2 + " = " + resta);
        System.out.println(fr1 + " * " + fr2 + " = " + multiplicacion);
        System.out.println(fr1 + " / " + fr2 + " = " + divicion);
        return f;
    }
}

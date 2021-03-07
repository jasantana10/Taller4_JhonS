
package Punto4;


public class Bicicleta
{
    private int velocidadActual;
    private int platoActual;
    private int piñonActual;
    
    public Bicicleta()
    {
        this.velocidadActual = 25;
        this.platoActual = 10;
        this.piñonActual = 5;
    }

    public int getVelocidadActual()
    {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual)
    {
        this.velocidadActual = velocidadActual;
    }

    public int getPlatoActual()
    {
        return platoActual;
    }

    public void setPlatoActual(int platoActual)
    {
        this.platoActual = platoActual;
    }

    public int getPiñonActual()
    {
        return piñonActual;
    }

    public void setPiñonActual(int piñonActual)
    {
        this.piñonActual = piñonActual;
    }
    
    public int Acelerar()
    {
       return this.velocidadActual * 2;
    }
    
    public int Frenar()
    {
        return this.velocidadActual / 2;
    }
    
    public int CambiarPlato(int plato)
    {
       return this.platoActual = plato;
    }
    
    public int CambiarPiñon(int piñon)
    {
       return this.piñonActual = piñon;
    }
}

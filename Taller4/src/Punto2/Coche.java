
package Punto2;


public class Coche
{
    private String color;
    private String marca;
    private String modelo;
    private int N_caballos;
    private int N_puertas;
    private String matricula;
    
    public Coche()
    {
        this.color = "negro";
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public int getN_caballos()
    {
        return N_caballos;
    }

    public void setN_caballos(int N_caballos)
    {
        this.N_caballos = N_caballos;
    }

    public int getN_puertas()
    {
        return N_puertas;
    }

    public void setN_puertas(int N_puertas)
    {
        this.N_puertas = N_puertas;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }
}


package Punto5;


public class Producto
{
    private int codigo;
    private String nombre;
    private double precioCompra;
    private double porcentajeUtilidad;
    
    public Producto()
    {
        this.precioCompra = 30000;
        this.porcentajeUtilidad = 30;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public double getPrecioCompra()
    {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra)
    {
        this.precioCompra = precioCompra;
    }

    public double getPorcentajeUtilidad()
    {
        return porcentajeUtilidad;
    }

    public void setPorcentajeUtilidad(double porcentajeUtilidad)
    {
        this.porcentajeUtilidad = porcentajeUtilidad;
    }
    
    public double PrecioVenta(double precioVenta)
    {
        double temp;
        temp = (this.porcentajeUtilidad * this.precioCompra) / 100;
        precioVenta = temp + this.precioCompra;
        return precioVenta;
    }
}

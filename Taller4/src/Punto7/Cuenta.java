
package Punto7;


public class Cuenta
{
    private int NoCuenta;
    private String nombreCliente;
    private double saldo;
    
    public Cuenta()
    {
        
    }

    public int getNoCuenta()
    {
        return NoCuenta;
    }

    public void setNoCuenta(int NoCuenta)
    {
        this.NoCuenta = NoCuenta;
    }

    public String getNombreCliente()
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente)
    {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
    public boolean Consignar(double monto)
    {
        if (monto > 0)
        {
            this.saldo = this.saldo + monto;
        }
        return true;
    }
    
    public boolean Retirar(double monto)
    {
        if (this.saldo > monto)
        {
            this.saldo = this.saldo - monto;
        }else{
            System.out.println("SALDO INSUFICIENTE");
        }
        return true;
    }
}

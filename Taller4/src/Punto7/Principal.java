
package Punto7;

import java.util.Scanner;


public class Principal
{
    public static void main(String[] args)
    {
        Cuenta c = new Cuenta();
        
        c.setSaldo(27000);
        System.out.println("Su saldo es: " + c.getSaldo());
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE MONTO A CONSIGNAR: ");    
        c.Consignar(entrada.nextDouble());
        System.out.println("Consignacion Exitosa...");
        System.out.println("Nuevo Saldo: " + c.getSaldo() + "\n");
        
        System.out.println("DIGITE MONTO A RETIRAR: ");
        c.Retirar(entrada.nextDouble());
        System.out.println("Retiro Exitoso...");
        System.out.println("Nuevo Saldo: " + c.getSaldo());
    }
}

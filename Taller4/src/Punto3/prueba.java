/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

/**
 *
 * @author lenovo
 */
public class prueba
{
    //PRUEBA DE CALCULOS DEL TRIANGULO
    public static void main(String[] args)
    {
        Triangulo t = new Triangulo();
        
        t.setBase(60);
        t.setAltura(40);
        System.out.println("Area de triangulo: " + t.calcularArea());
        System.out.printf("Lados Iguales: %.2f\n", t.calcularLadosIgules(0,0));
        System.out.printf("Perimetro: %.2f\n" , t.calcularPerimetro(0,0,0));
    }
}

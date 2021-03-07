
package Punto6;

import java.util.Scanner;


public class Principal
{
    public static void main(String[] args)
    {
        Libro lb = LeerInformacion();
        MostrarInformacion(lb);
    }
    
    public static Libro LeerInformacion()
    {
        Scanner entrada = new Scanner(System.in);
        Libro lb = new Libro();
        System.out.println("Titulo del Libro: ");
        lb.setTitulo(entrada.nextLine());
        System.out.println("Primer Nombre: ");
        lb.setPrimerNombre(entrada.nextLine());
        System.out.println("Segundo Nombre: ");
        lb.setSegundoNombre(entrada.nextLine());
        System.out.println("Primer Apellido: ");
        lb.setPrimerApellido(entrada.nextLine());
        System.out.println("Codigo ISBN: ");
        lb.setIsbn(entrada.nextLine());
        System.out.println("Edicion: ");
        lb.setEdicion(entrada.nextLine());
        System.out.println("Pais: ");
        lb.setPais(entrada.nextLine());
        System.out.println("Ciudad: ");
        lb.setCiudad(entrada.nextLine());
        System.out.println("Fecha de Edicion: ");
        lb.setFecha(entrada.nextLine());
        System.out.println("Numero de Paginas: ");
        lb.setPaginas(entrada.nextInt());
        
        return lb;
    }
    
    public static  void MostrarInformacion(Libro libro)
    {
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println(libro.getEdicion());
        System.out.println("Autor: " + libro.getPrimerApellido()+ ", " + libro.getSegundoNombre()+ ". " + libro.getPrimerNombre());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println(libro.getCiudad() + ", " + libro.getPais() +", "+ libro.getFecha());
        System.out.println(libro.getPaginas() + " " + "paginas");
    }
}

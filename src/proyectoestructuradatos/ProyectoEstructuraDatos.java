package proyectoestructuradatos;
import java.util.Random;
import java.util.Scanner;

public class ProyectoEstructuraDatos 
{
    private static ListaS lista = new ListaS();

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        String DatosAlumno, ape, name, alumnoEliminar, nota; 

        
        new MenuPrincipal().setVisible(true); 
       
    }
    public static void Add(String DatosAlumno)
    {
    try 
    { 
        lista.addAlumno(DatosAlumno);
        lista.imprimir();
        new MenuPrincipal().setVisible(true);
     }
     catch (NumberFormatException ex) 
     {
        new Aviso().setVisible(true);
     }
    }
    public static void Eliminar(String Eliminar)
    {
        try 
        {
            lista.eliminar(Eliminar);
            lista.imprimir();
            new MenuPrincipal().setVisible(true);
         }
         catch (NumberFormatException ex) 
         {
            new Aviso().setVisible(true);
         }
    }
    
}

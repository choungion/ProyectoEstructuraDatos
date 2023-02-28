package proyectoestructuradatos;
import java.util.Scanner;

public class ProyectoEstructuraDatos {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        ListaS lista = new ListaS();
        String name;
        String ape;
        String fullname; 

        System.out.println("Ingrese el nombre del alumno: ");
        name = sc.next();
        System.out.println("Ingrese el apellido del alumno: ");
        ape = sc.next();
        fullname = name +", " + ape;
        lista.addAlumno(fullname);
        lista.imprimir();
    }
    
}

package proyectoestructuradatos;
import java.util.Random;
import java.util.Scanner;

public class ProyectoEstructuraDatos {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        MenuAdd menu = new MenuAdd();
        
        ListaS lista = new ListaS();
        String fullname, DatosAlumno, ape, name; 
        Random random = new Random();
        int ID = random.nextInt(900)+100;
        double nota;

        new MenuAdd().setVisible(true);
        
        /*
        System.out.println("Ingrese el nombre del alumno: ");
        name = sc.next();
        System.out.println("Ingrese el apellido del alumno: ");
        ape = sc.next();
        fullname = name +", " + ape;
        System.out.println("Ingrese la nota del alumno: ");
        nota = sc.nextDouble();
        DatosAlumno = fullname + " " + ID + " " + nota;
         lista.addAlumno(DatosAlumno);
         */

        

       
        lista.imprimir();
    }
    
}

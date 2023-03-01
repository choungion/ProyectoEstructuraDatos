package proyectoestructuradatos;
import java.util.Random;
import java.util.Scanner;

public class ProyectoEstructuraDatos {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        ListaS lista = new ListaS();
        String DatosAlumno, ape, name, alumnoEliminar, nota; 

        /*
        MenuAdd menu = new MenuAdd();
        Random random = new Random();
        int ID = random.nextInt(900)+100;
        double nota;
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
        
        new MenuPrincipal().setVisible(true); */

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del alumno: ");
            name = sc.nextLine();
            System.out.println("Ingrese el apellido del alumno: ");
            ape = sc.nextLine();
            System.out.println("Ingrese la nota del alumno: ");
            nota = sc.nextLine();

            DatosAlumno = name+" "+ape+" "+nota;
            lista.addAlumno(DatosAlumno);
        }

        System.out.println("Lista de alumnos--");
        lista.imprimir();
        System.out.println("Escriba el ID del alumno que desee eliminar");
        alumnoEliminar = sc.nextLine();
        System.out.println();
        lista.eliminar(alumnoEliminar);
        lista.imprimir();
    }
    
}

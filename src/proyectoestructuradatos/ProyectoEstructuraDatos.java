package proyectoestructuradatos;

import java.util.Random;
import java.util.Scanner;

public class ProyectoEstructuraDatos {
    private static ListaS lista = new ListaS();

    public static void main(String[] args) {
        new MenuPrincipal().setVisible(true);
    }

    public static void Add(String DatosAlumno) {
        lista.addAlumno(DatosAlumno);
        lista.imprimir();
        new MenuPrincipal().setVisible(true);
    }

    public static void Eliminar(String Eliminar) {
            lista.eliminar(Eliminar);
            lista.imprimir();
            new MenuPrincipal().setVisible(true);
    }

    public static void Completar(String Dato) {
        lista.Completar(Dato);
    }

}

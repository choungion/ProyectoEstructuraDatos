package proyectoestructuradatos;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

public class ProyectoEstructuraDatos {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Menu menu = new Menu();

        ListaS lista = new ListaS();
        

        new Menu().setVisible(true);
        
        

        
        lista.imprimir();
    }
    
    
}

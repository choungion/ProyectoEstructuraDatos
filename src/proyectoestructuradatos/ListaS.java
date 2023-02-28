/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructuradatos;

import javax.swing.JOptionPane;


public class ListaS  {
    private Nodo primero;
    private Nodo ultimo;
    private int tamano;
    

    public ListaS() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }

    public boolean siVacio() {
        if (this.primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public int addAlumno(String dato) 
    {
        
        if (siVacio()) 
        {
            

            Nodo nuevo = new Nodo(dato);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.nodoDer = nuevo;
        } else {
            Nodo nuevo = new Nodo(dato);
            nuevo.nodoDer = null;
            ultimo.nodoDer = nuevo;
            ultimo = nuevo;
        }
        this.tamano++;
        return this.tamano;
    }

    public void eliminar(String dato) {
        if (tamano != 0) {
            Nodo indice = primero;
            Nodo anterior = null;
            if (indice.dato == dato) {
                anterior = indice.nodoDer;
                primero = anterior;
                tamano -= 1;
            } else {
                for (int i = 0; i < this.tamano; i++) {
                    if (indice.dato == dato) {
                        if (indice.dato == dato && ultimo.dato == dato) {
                            anterior.nodoDer = null;
                            ultimo = anterior;
                        } else {
                            anterior.nodoDer = indice.nodoDer;
                        }
                        this.tamano -= 1;
                        break;
                    } else {
                        anterior = indice;
                        indice = indice.nodoDer;
                    }
                }
            }
        } else {
            System.out.println("No hay ningún nodo\n");
        }
    }

    public void imprimir() {
        if (tamano != 0) {
            Nodo temp = primero;
            String str = "";

            for (int i = 0; i < this.tamano; i++) {
                str = str + temp.dato + "\n";
                temp = temp.nodoDer;
            }

            JOptionPane.showMessageDialog(null, str);
        }
    }

}

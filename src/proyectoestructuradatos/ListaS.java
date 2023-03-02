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
    private static String datos, nombre, info, nota;
    
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
            String[] datosIndice = indice.dato.split(" ");
            String[] datosUltimo = ultimo.dato.split(" ");
            if (datosIndice[0].equals(dato)) {
                anterior = indice.nodoDer;
                primero = anterior;
                tamano -= 1;
            } else {
                for (int i = 0; i < this.tamano; i++) {
                    if (datosIndice[0].equals(dato)) {
                        if (datosIndice[0].equals(dato) && datosUltimo[0].equals(dato)) {
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
                        datosIndice = indice.dato.split(" ");
                    }
                }
            }
        } else {
            System.out.println("No hay ningún nodo\n");
        }
    }

    public Nodo[] Completar(String dato) {
        Nodo[] nodos = new Nodo[4];
        Nodo indice = primero;
        int contador = 0;
        
        while (indice != null && contador < 4) {
            String[] datosIndice = indice.dato.split(" ");
            
            if (datosIndice[0].equals(dato)) {
                nodos[0] = indice;
                
                for (int i = 1; i < 4 && indice.nodoDer != null; i++) {
                    indice = indice.nodoDer;
                    nodos[i] = indice;
                }
                String[] datos = nodos[0].dato.split(" ");
                nombre = datos[1] + " " + datos[2];
                nota = datos[3];
                return nodos;
            }
            
            indice = indice.nodoDer;
            contador++;
        }
        
        return null;
    }

    public void imprimir() {
        if (tamano != 0) {
            Nodo temp = primero;
            String str = "";

            for (int i = 0; i < this.tamano; i++) {
                str = str + temp.dato + "\n";
                temp = temp.nodoDer;
            }

            //JOptionPane.showMessageDialog(null, str);
            System.out.println(str);
        }
    }
    public static String nombre()
    {
        return nombre;
    }
    public static String nota()
    {
        return nota;
    }
}

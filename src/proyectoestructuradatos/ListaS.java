package proyectoestructuradatos;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

public class ListaS  {
    private Nodo primero;
    private Nodo ultimo;
    private int tamano;
    private static String datos, nombre, info, nota;
    private String[] split = new String[ListaMenu().size()];
    
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

    public int agregarAlumno(String datos) 
    {
        if (siVacio()) 
        {
            Nodo nuevo = new Nodo(datos);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.nodoDer = nuevo;
        } else {
            Nodo nuevo = new Nodo(datos);
            nuevo.nodoDer = null;
            ultimo.nodoDer = nuevo;
            ultimo = nuevo;
        }
        tamano++;
        return tamano;
    }

    public void eliminarAlumno(String ID) {
        if (tamano != 0) {
            Nodo indice = primero;
            Nodo anterior = null;
            String[] datosIndice = indice.dato.split(" ");
            String[] datosUltimo = ultimo.dato.split(" ");
            if (datosIndice[0].equals(ID)) {
                anterior = indice.nodoDer;
                primero = anterior;
                tamano -= 1;
            } else {
                for (int i = 0; i < tamano; i++) {
                    if (datosIndice[0].equals(ID)) {
                        if (datosIndice[0].equals(ID) && datosUltimo[0].equals(ID)) {
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
                System.out.println("No se encontro alumno");
            }
        } else {
            System.out.println("No existe ningún alumno\n");
        }
    }

    public String consultarNota(String ID){
        if (tamano != 0) {
            Nodo temp = primero;
            String[] datosAlumno = temp.dato.split(" ");
            
            for (int i = 0; i < tamano; i++) {
                if (ID.equals(datosAlumno[0])) {
                    return datosAlumno[3];//Nota del alumno
                } else{
                    temp = temp.nodoDer;
                    datosAlumno = temp.dato.split(" ");
                }
            }
        } else{
            return "Lista vacia";
        }
        return "No existe ese ID";
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

    public List<String> ListaMenu() 
    {
        List<String> Lista = new ArrayList<String>();
        if (tamano != 0) 
        {
            Nodo temp = primero;
            String str = "";

            for (int i = 0; i < tamano; i++) {
                str = str + temp.dato + "\n";
                temp = temp.nodoDer;
            }
            
            Lista.add(str);
            return Lista;
        }
        return Lista;
    }
    
    public void separar(List<String> Lista)
    {
        for (String str : Lista) 
        {
            split = str.split(" ");
            for (String posc : split) 
            {
                for (int i = 0; i < ListaMenu().size(); i++) 
                {
                    split[i] = ListaMenu().get(i);
                }
            }
        }
    }

    public void imprimir() {
        if (tamano != 0) {
            Nodo temp = primero;
            String str = "";

            for (int i = 0; i < tamano; i++) {
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
    public String[] DatosLista()
    {
        return split;
    }
    
}

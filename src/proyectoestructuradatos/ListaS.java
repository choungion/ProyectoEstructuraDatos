package proyectoestructuradatos;

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
}

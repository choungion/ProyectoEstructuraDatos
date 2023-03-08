package proyectoestructuradatos;

import proyectoestructuradatos.Menus.Aviso;
import proyectoestructuradatos.Menus.MenuPrincipal;


public class ProyectoEstructuraDatos {
    private static ListaS lista = new ListaS();


    public static void main(String[] args) { 
        new MenuPrincipal().setVisible(true);
    }
    public static void Add(String DatosAlumno)
    {
    try 
    { 
        lista.agregarAlumno(DatosAlumno);
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
            lista.eliminarAlumno(Eliminar);
            lista.imprimir();
            new MenuPrincipal().setVisible(true);
    }

    public static void Completar(String Dato) {
        lista.Completar(Dato);
        lista.separar(lista.ListaMenu());
        String[] ID = lista.DatosLista();
        System.out.println(ID[0]);
    }
    public static String Imprimir()
    {
        return lista.imprimir();
    }
   /* public String ID(int i) 
    {
        lista.separar(lista.ListaMenu());
        String ID=lista.separar(lista.ListaMenu());
        return ID;
    }
    */

}

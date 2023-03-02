/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructuradatos;

public class Nodo {
    Nodo nodoDer;
    String dato;
    
    public Nodo(String dato){
        this.dato = String.format("%03d", Math.round(Math.random()*999))+" "+dato;
        this.nodoDer = null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;

/**
 *
 * @author Dante
 */
public class Biblioteca {
    public void devuelveLibro (Libro libro){
        if (libro.getEstado().equals("Malo")) {
            AlarmaLibro a = new AlarmaLibro();
            a.notifyObservers();
        } else {
        }
    }
    
}

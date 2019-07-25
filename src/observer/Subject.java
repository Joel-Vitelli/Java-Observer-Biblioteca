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
public interface Subject {
    void attach (ILibroMalEstado observador);
    void dettach (ILibroMalEstado observador);
    void notifyObservers();
}

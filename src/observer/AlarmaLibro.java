/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;

import java.util.ArrayList;

/**
 *
 * @author Dante
 */



public class AlarmaLibro implements Subject {
    
    private static ArrayList<ILibroMalEstado> refObservadores = new ArrayList();

    public AlarmaLibro() {
    }
    

    @Override
    public void attach(ILibroMalEstado observador) {
        refObservadores.add(observador);
        
    }

    @Override
    public void dettach(ILibroMalEstado observador) {
        refObservadores.remove(observador);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < refObservadores.size(); i++) {
            refObservadores.get(i).update();
        }
    }
    
}

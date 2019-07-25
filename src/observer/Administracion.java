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
public class Administracion implements ILibroMalEstado{

    @Override
    public void update() {
        System.out.println("Administracion");
        System.out.println("Envio una queja formal");
    }
    
}

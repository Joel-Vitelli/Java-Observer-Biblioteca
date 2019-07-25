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
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlarmaLibro a = new AlarmaLibro();
        Compras comp = new Compras();
        Stock stock = new Stock();
        Administracion admi1 = new Administracion();
        
        a.attach(admi1);
        a.attach(comp);
        a.attach(stock);
        
        Libro libro1 = new Libro("El señor de los anillos", "Bueno");
        libro1.setEstado("Malo");
        
        Biblioteca b = new Biblioteca();
        b.devuelveLibro(libro1);
        
    }
    
}

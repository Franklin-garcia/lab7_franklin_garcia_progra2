/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_franklin_garcia;

import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class hilo_batalla implements Runnable {
    private String id;
    private guerreros jugador1;
    private guerreros jugador2;

    public hilo_batalla(String id, guerreros jugador1, guerreros jugador2) {
        this.id = id;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        
    }

   

    @Override
    public void run() {
        
    }
    
    
}

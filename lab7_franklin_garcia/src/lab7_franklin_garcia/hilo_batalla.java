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
    private boolean vive;

    public hilo_batalla(ArrayList<hilo_batalla> pelea, String id, guerreros jugador1, guerreros jugador2) {
        this.id = id;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        vive = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public guerreros getJugador1() {
        return jugador1;
    }

    public void setJugador1(guerreros jugador1) {
        this.jugador1 = jugador1;
    }

    public guerreros getJugador2() {
        return jugador2;
    }

    public void setJugador2(guerreros jugador2) {
        this.jugador2 = jugador2;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (true/*jugador1 == 0 || jugador2 == 0*/) {
                vive = false;
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }

}

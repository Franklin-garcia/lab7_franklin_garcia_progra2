/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_franklin_garcia;

import java.io.Serializable;

/**
 *
 * @author Franklin Garcia
 */
public abstract class guerreros implements Serializable , comportamiento{
    
    private static final long SerialVersionUID = 777L;
    //un nombre, un nickname, un poder de ataque, un poder de defensa, salud y puntos.  
    protected String nombre;
    protected String nickname;
    protected int poder_ataque;
    protected int porder_defensa;
    protected int salud;
    protected int puntos;

    public guerreros() {
    }

    public guerreros(String nombre, String nickname, int poder_ataque, int porder_defensa, int salud, int puntos) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.poder_ataque = poder_ataque;
        this.porder_defensa = porder_defensa;
        this.salud = salud;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPoder_ataque() {
        return poder_ataque;
    }

    public void setPoder_ataque(int poder_ataque) {
        this.poder_ataque = poder_ataque;
    }

    public int getPorder_defensa() {
        return porder_defensa;
    }

    public void setPorder_defensa(int porder_defensa) {
        this.porder_defensa = porder_defensa;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    @Override
    public abstract void ataque();
    
}

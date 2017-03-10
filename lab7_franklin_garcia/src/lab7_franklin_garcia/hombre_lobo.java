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
public class hombre_lobo extends guerreros{
    private ArrayList<guerreros>hombre_lobo=new ArrayList();

    public hombre_lobo() {
        super();
    }

    public hombre_lobo(String nombre, String nickname, int poder_ataque, int porder_defensa, int salud, int puntos) {
        super(nombre, nickname, poder_ataque, porder_defensa, salud, puntos);
    }

    public ArrayList<guerreros> getHombre_lobo() {
        return hombre_lobo;
    }

    public void setHombre_lobo(ArrayList<guerreros> hombre_lobo) {
        this.hombre_lobo = hombre_lobo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    public void ataque(){
        
    }
    
}

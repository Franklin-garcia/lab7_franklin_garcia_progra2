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
public class dragon extends guerreros{
    private ArrayList<guerreros> dragon = new ArrayList(); 

    public dragon() {
        super();
    }
    
    public dragon(String nombre, String nickname, int poder_ataque, int porder_defensa, int salud, int puntos) {
        super(nombre, nickname, poder_ataque, porder_defensa, salud, puntos);
    }

    public ArrayList<guerreros> getDragon() {
        return dragon;
    }

    public void setDragon(ArrayList<guerreros> dragon) {
        this.dragon = dragon;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public void ataque(){
        
    }
    
}

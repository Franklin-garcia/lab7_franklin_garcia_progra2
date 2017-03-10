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
public class minotauro extends guerreros {
   private ArrayList <guerreros>minotauro=new ArrayList();

    public minotauro() {
        super();
    }

    public minotauro(String nombre, String nickname, int poder_ataque, int porder_defensa, int salud, int puntos) {
        super(nombre, nickname, poder_ataque, porder_defensa, salud, puntos);
    }

    public ArrayList<guerreros> getMinotauro() {
        return minotauro;
    }

    public void setMinotauro(ArrayList<guerreros> minotauro) {
        this.minotauro = minotauro;
    }

    @Override
    public String toString() {
        return nombre;
    }
   public void ataque(){
       
   }
   
}

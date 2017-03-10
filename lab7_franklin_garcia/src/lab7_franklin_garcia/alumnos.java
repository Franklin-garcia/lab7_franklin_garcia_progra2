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
public class alumnos extends guerreros{
    
    private ArrayList<guerreros>alumnos=new ArrayList();

    public alumnos() {
        super();
    }

    public alumnos(String nombre, String nickname, int poder_ataque, int porder_defensa, int salud, int puntos) {
        super(nombre, nickname, poder_ataque, porder_defensa, salud, puntos);
    }

    public ArrayList<guerreros> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<guerreros> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
   public void ataque(){
      
   } 
}

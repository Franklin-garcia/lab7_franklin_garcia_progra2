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
    private int cuenta;
    private String carrera;
    private int edad;
    
    private ArrayList<guerreros>alumnos=new ArrayList();

    public alumnos() {
        super();
    }

    public alumnos(int cuenta, String carrera, int edad, String nombre, String nickname, int poder_ataque, int porder_defensa, int salud, int puntos) {
        super(nombre, nickname, poder_ataque, porder_defensa, salud, puntos);
        this.cuenta = cuenta;
        this.carrera = carrera;
        this.edad = edad;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_franklin_garcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class admiGuerrero implements Serializable {

    private static final long SerialVersionUID = 222L;

    private ArrayList<guerreros> lista_guerreros = new ArrayList();
    private File archivo = null;

    public admiGuerrero(String path) {
        archivo = new File(path);
    }

    public ArrayList<guerreros> getListaAlumnos() {
        return lista_guerreros;
    }

    public void setListaAlumnos(ArrayList<guerreros> lista_guerreros) {
        this.lista_guerreros = lista_guerreros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setGuerrero(guerreros a) {
        lista_guerreros.add(a);
    }

    //
    public void cargarArchivo() {
        try {
            lista_guerreros = new ArrayList();
            guerreros temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (guerreros) objeto.readObject()) != null) {
                        lista_guerreros.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (guerreros t : lista_guerreros) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }

}

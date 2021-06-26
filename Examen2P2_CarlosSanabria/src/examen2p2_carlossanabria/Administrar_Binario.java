/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_carlossanabria;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author HP1
 */
public class Administrar_Binario {
     private ArrayList<Guardar> listaGuardar = new ArrayList();
    private File archivo = null;

    public Administrar_Binario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Guardar> getListaGuardar() {
        return listaGuardar;
    }

    public void setListaGuardar(ArrayList<Guardar> listaGuardar) {
        this.listaGuardar = listaGuardar;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setGuardar(Guardar c) {
        listaGuardar.add(c);
    }

    public void cargarArchivo() {
        try {
            listaGuardar = new ArrayList();
             Guardar temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Guardar) objeto.readObject()) != null) {
                        listaGuardar.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Guardar t : listaGuardar) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}

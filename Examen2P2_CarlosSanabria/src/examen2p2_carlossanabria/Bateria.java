/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_carlossanabria;

import java.io.Serializable;

/**
 *
 * @author HP1
 */
public class Bateria implements Serializable{
    private String Marca;
    private int capacidad;
    private int autonomia;
    private int capapcidad_modulos;
    private int capacidad_carga;
    private String tipo_Vehiculo;
    private int tiempo;
    private static final long SerialVersionUID=784L;

    public Bateria(String Marca, int capacidad, int autonomia, int capapcidad_modulos, int capacidad_carga, String tipo_Vehiculo, int tiempo) {
        this.Marca = Marca;
        this.capacidad = capacidad;
        this.autonomia = autonomia;
        this.capapcidad_modulos = capapcidad_modulos;
        this.capacidad_carga = capacidad_carga;
        this.tipo_Vehiculo = tipo_Vehiculo;
        this.tiempo = tiempo;
    }
    

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

   
    public int getCapapcidad_modulos() {
        return capapcidad_modulos;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public void setCapapcidad_modulos(int capapcidad_modulos) {
        this.capapcidad_modulos = capapcidad_modulos;
    }

    public int getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(int capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public String getTipo_Vehiculo() {
        return tipo_Vehiculo;
    }

    public void setTipo_Vehiculo(String tipo_Vehiculo) {
        this.tipo_Vehiculo = tipo_Vehiculo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Bateria{" + "Marca=" + Marca + ", capacidad=" + capacidad + ", autonomia=" + autonomia + ", capapcidad_modulos=" + capapcidad_modulos + ", capacidad_carga=" + capacidad_carga + ", tipo_Vehiculo=" + tipo_Vehiculo + ", tiempo=" + tiempo + '}';
    }
    
}

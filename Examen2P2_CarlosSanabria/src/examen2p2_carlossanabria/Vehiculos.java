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
public class Vehiculos implements Serializable{
    private String marca;
    private String modelo;
    private int vin;
    private String carroceria;
    private static final long SerialVersionUID=788L;

    public Vehiculos() {
    }

    public Vehiculos(String marca, String modelo, int vin, String carroceria) {
        this.marca = marca;
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public String toString() {
        return "Vehiculos: " + "marca: " + marca + ", modelo: " + modelo + ", vin: " + vin + ", tipo de carroceria:" + carroceria;
    }
    
}

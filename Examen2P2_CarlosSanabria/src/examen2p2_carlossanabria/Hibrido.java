/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_carlossanabria;

/**
 *
 * @author HP1
 */
public class Hibrido extends Vehiculos{
    private int capaci_m;
    private int cantidad_de_galones;

    public Hibrido(int capaci_m, int cantidad_de_galones) {
        this.capaci_m = capaci_m;
        this.cantidad_de_galones = cantidad_de_galones;
    }

    public Hibrido(int capaci_m, int cantidad_de_galones, String marca, String modelo, int vin, String carroceria) {
        super(marca, modelo, vin, carroceria);
        this.capaci_m = capaci_m;
        this.cantidad_de_galones = cantidad_de_galones;
    }

    public int getCapaci_m() {
        return capaci_m;
    }

    public void setCapaci_m(int capaci_m) {
        this.capaci_m = capaci_m;
    }

    public int getCantidad_de_galones() {
        return cantidad_de_galones;
    }

    public void setCantidad_de_galones(int cantidad_de_galones) {
        this.cantidad_de_galones = cantidad_de_galones;
    }

    @Override
    public String toString() {
        return "Hibrido{" + "capaci_m=" + capaci_m + ", cantidad_de_galones=" + cantidad_de_galones + '}';
    }
    
    
}

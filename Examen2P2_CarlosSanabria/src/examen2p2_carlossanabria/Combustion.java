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
public class Combustion extends Vehiculos{
    private int cilindraje;
    private int cant_cilin;
    private int consumo;

    public Combustion(int cilindraje, int cant_cilin, int consumo) {
        this.cilindraje = cilindraje;
        this.cant_cilin = cant_cilin;
        this.consumo = consumo;
    }

    public Combustion(int cilindraje, int cant_cilin, int consumo, String marca, String modelo, int vin, String carroceria) {
        super(marca, modelo, vin, carroceria);
        this.cilindraje = cilindraje;
        this.cant_cilin = cant_cilin;
        this.consumo = consumo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCant_cilin() {
        return cant_cilin;
    }

    public void setCant_cilin(int cant_cilin) {
        this.cant_cilin = cant_cilin;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return super.toString()+" Tipo de Vehiculo: Combustion";
    }
    
}

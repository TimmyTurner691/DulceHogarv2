/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dulcehogar;

/**
 *
 * @author jaket
 */
public class Socio extends Persona {
    private final int numeroSocio;
    private int valorCuota;
    private int cantidadAportada;
    private int numeroCuota;

    public Socio(int numeroSocio, String rut) {
        super(rut); 
        this.numeroSocio = numeroSocio;
        this.valorCuota = 0;
        this.cantidadAportada = 0;
        this.numeroCuota = 0;
    }

    public void cancelarCuota(int monto, int numero) {
        this.setValorCuota(monto);
        this.cantidadAportada += this.valorCuota;
        this.numeroCuota = numero - 1;
        
    }
    
    public int getNumeroSocio() {
        return numeroSocio;
    }

    public int getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(int valorCuota) {
        this.valorCuota = valorCuota;
    }

    public int getCantidadAportada() {
        return cantidadAportada;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dulcehogar;

/**
 *
 * @author jaket
 */
public class Socio {
    private final int numeroSocio;
    private final String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String domicilio;
    private String comuna;
    private String telefono;
    private int valorCuota;
    private int cantidadAportada;
    private int numeroCuota;

    public Socio(int numeroSocio, String rut) {
        this.numeroSocio = numeroSocio;
        this.rut = rut;
        this.nombre = "";
        this.apellidoPaterno = "";
        this.apellidoMaterno = "";
        this.domicilio = "";
        this.comuna = "";
        this.telefono = "";
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

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
    
    
    public  String showSocio() {
        return "Número de Socio: " + numeroSocio + "\n" +
               "RUT: " + rut + "\n" +
               "Nombre: " + nombre + "\n" +
               "Apellido Paterno: " + apellidoPaterno + "\n" +
               "Apellido Materno: " + apellidoMaterno + "\n" +
               "Domicilio: " + domicilio + "\n" +
               "Comuna: " + comuna + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Valor Cuota: $" + valorCuota + "\n" +
               "Cantidad Aportada: $" + cantidadAportada;
    }


    @Override
    public String toString() {
        return "Socio{" + "numeroSocio=" + numeroSocio + ", rut=" + rut + 
                ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + 
                ", apellidoMaterno=" + apellidoMaterno + 
                ", domicilio=" + domicilio + ", comuna=" + comuna + ", telefono=" + telefono + 
                ", valorCuota=" + valorCuota + ", cantidadAportada=" + 
                cantidadAportada + '}';
    }

    
    
}

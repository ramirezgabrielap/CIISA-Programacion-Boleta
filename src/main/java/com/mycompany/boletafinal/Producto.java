package com.mycompany.boletafinal;


public class Producto {
    private String nombre;
    private int precio;
    private int cantidad;
    private int total;
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    } 
    
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    
    public void Imprimir() {
        System.out.println("Ingresaste: " + nombre + " $ " + precio + " c/u x " + cantidad + " = " + total);
    }
    public void ImprimirFin() {
        System.out.println(nombre + " $ " + precio + " x " + cantidad + " = " + total);
    }
}
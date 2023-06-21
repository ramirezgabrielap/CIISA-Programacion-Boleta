package com.mycompany.boletafinal;
import java.util.ArrayList;
import java.util.Scanner;  

public class BoletaFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String desicion;
        double neto, iva;
        int totalProductos = 0;
        int totalCant = 0;
        
        ArrayList<Producto> lista = new ArrayList<Producto>();
        
        do {
            Producto producto1 = new Producto();
            System.out.println("Ingrese Producto: ");
            producto1.setNombre(sc.next());      
            System.out.println("Ingrese su Precio: ");
            producto1.setPrecio(sc.nextInt());
            System.out.println("Ingrese Cantidad: ");
            producto1.setCantidad(sc.nextInt());
            producto1.setTotal(producto1.getCantidad() * producto1.getPrecio());
            producto1.Imprimir();
            lista.add(producto1);
            System.out.println("¿DESEA AGREGAR PRODUCTOS? ");
            System.out.println(" SI / NO ");
            desicion = sc.next();
        } while (desicion.equals("si") || desicion.equals("SI") || desicion.equals("Si") || desicion.equals("s") || desicion.equals("S"));

        System.out.println("----------------------------------------");
        System.out.println("GENERANDO BOLETA");
        System.out.println("----------------------------------------\n");

        for (int i = 0; i < lista.size(); i ++) {
            lista.get(i).ImprimirFin();
            totalProductos = totalProductos + (lista.get(i).getTotal());
            totalCant = totalCant + lista.get(i).getCantidad();   
        }  
     
    neto = (totalProductos / 1.19);
    iva = (totalProductos - neto);
    System.out.println("\nTotal artículos " + totalCant);    
    System.out.println("SubTotal (Valor Neto): " + neto);
    System.out.println("IVA (19%): " + iva);
    System.out.println("\nTOTAL A PAGAR: $" + totalProductos + "\n");   
    
    System.out.println("----------------------------------------");
    System.out.println("Gracias por preferirnos");
    
    }
}
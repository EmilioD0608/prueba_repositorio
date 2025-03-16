/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author e_d_d
 */
public class Carrito {
     private List<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println(producto.getNombre() + " agregado al carrito.");
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Productos en el carrito:");
            for (Producto p : productos) {
                System.out.println("- " + p);
            }
        }
    }
}

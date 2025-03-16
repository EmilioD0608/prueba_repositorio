/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import src.modelos.Carrito;
import src.modelos.Producto;

/**
 *
 * @author e_d_d
 */
public class Mavenproject1 {

    public static void main(String[] args) {
           Carrito carrito = new Carrito();
        
        Producto p1 = new Producto("Laptop", 850.50);
        Producto p2 = new Producto("Mouse", 25.75);
        Producto p3 = new Producto("Teclado", 22.5);
        
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);
        
        
        //cambio anti pro
        carrito.mostrarProductos();
    }
    }


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog03.Principal;

import com.prog03.figuras.Rectangulo;

/**
 *
 * @author Joseme
 */
public class Principal {
    public static void main(String[] args) {
        // Instancia de dos objetos de la clase Rectangulo
        Rectangulo rectangulo1 = new Rectangulo(7, 21);
        Rectangulo rectangulo2 = new Rectangulo(7, 7);

        // Comprobación del funcionamiento
        System.out.println("Rectángulo 1:");
        System.out.println("Base: " + rectangulo1.getBase());
        System.out.println("Altura: " + rectangulo1.getAltura());
        System.out.println(rectangulo1.toString());
        System.out.println("Es cuadrado? " + (rectangulo1.isCuadrado() ? "Sí" : "No"));
        System.out.println();

        System.out.println("Rectángulo 2:");
        System.out.println("Base: " + rectangulo2.getBase());
        System.out.println("Altura: " + rectangulo2.getAltura());
        System.out.println(rectangulo2.toString());
        System.out.println("Es cuadrado? " + (rectangulo2.isCuadrado() ? "Sí" : "No"));
    }
}

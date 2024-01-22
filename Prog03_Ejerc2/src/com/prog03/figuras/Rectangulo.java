/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog03.figuras;

/**
 *
 * @author Joseme
 */
public class Rectangulo {
    private float base;
    private float altura;

    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    // Métodos para actualizar y obtener el valor de cada atributo
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Método para calcular el área del rectángulo
    public float getArea() {
        return base * altura;
    }

    // Método para obtener una cadena con el área y la altura
    public String toString() {
        return "Área: " + getArea() + ", Altura: " + altura;
    }

    // Método para verificar si el rectángulo es cuadrado
    public boolean isCuadrado() {
        return base == altura;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte2ejercicio;
public class Cuadrado {
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return Math.pow(lado, 2);
    }

    double calcularPerimetro() {
        return 4 * lado;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte2ejercicio;
public class TrianguloRectangulo {
    double base;
    double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura) / 2;
    }

    double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
    void determinarTipoTriangulo() {
        if ((base==altura)&&(base==calcularHipotenusa())&&(altura==calcularHipotenusa())) 
            System.out.println("Es triagulo equilatero");
        else if((base!=altura)&&(base!=calcularHipotenusa())&&(altura!=calcularHipotenusa())) 
            System.out.println("Es un triangulo escaleno");
        else
            System.out.println("Es un triangulo isosceles");
    }
}
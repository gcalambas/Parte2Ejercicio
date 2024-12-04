/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte2ejercicio;
import java.util.Scanner;

public class Parte2Ejercicio1{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ingresar datos para el círculo
        System.out.print("Ingrese el radio del circulo: ");
        double radio = entrada.nextDouble();
        Circulo circulo = new Circulo(radio);

        // Ingresar datos para el rectángulo
        System.out.print("Ingrese la base del rectangulo: ");
        double baseRect = entrada.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        double alturaRect = entrada.nextDouble();
        Rectangulo rectangulo = new Rectangulo(baseRect, alturaRect);

        // Ingresar datos para el cuadrado
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = entrada.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);

        // Ingresar datos para el triángulo rectángulo
        System.out.print("Ingrese la base del triangulo rectangulo: ");
        double baseTri = entrada.nextDouble();
        System.out.print("Ingrese la altura del triangulo rectangulo: ");
        double alturaTri = entrada.nextDouble();
        TrianguloRectangulo triangulo = new TrianguloRectangulo(baseTri, alturaTri);
        

        // Mostrar resultados
        System.out.println("El area del circulo es: " + circulo.calcularArea());
        System.out.println("El perimetro del circulo es:  " + circulo.calcularPerimetro());
        System.out.println();
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es. " + rectangulo.calcularPerimetro());
        System.out.println();
        System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
        System.out.println("El perimetro del cuadrado es: " + cuadrado.calcularPerimetro());
        System.out.println();
        System.out.println("El el area del triangulo: " + triangulo.calcularArea());
        System.out.println("El perimetro del triangulo es: "+ triangulo.calcularPerimetro());
        triangulo.determinarTipoTriangulo();
    }
}

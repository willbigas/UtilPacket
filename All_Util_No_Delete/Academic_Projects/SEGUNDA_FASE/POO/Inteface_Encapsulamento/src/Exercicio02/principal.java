/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02;

/**
 *
 * @author William
 */
public class principal {
    public static void main(String[] args) {
        Circulo umCirculo = new Circulo(5.0 ,2.5,2.0);
        Losango umLosango = new Losango(5.0 ,2.5);
        Quadrado umQuadrado = new Quadrado(25.0);
        Triangulo umTriangulo = new Triangulo(10.0 , 15.0);
        
        
        /**
         * Areas dos Elementos
         */
        System.out.println("|| Calculo de Area ||");
        System.out.println("Area do Circulo: " + umCirculo.obterArea());
        System.out.println("Area do Losango: " + umLosango.obterArea());
        System.out.println("Area do Quadrado: " + umQuadrado.obterArea());
        System.out.println("Area do Triangulo: " + umTriangulo.obterArea() + "\r\n");
        
        /**
         * Perimetro dos Elementos
         */
        System.out.println("|| Calculo de Perimetro ||");
        System.out.println("Perimetro do Circulo: " + umCirculo.obterPerimetro());
        System.out.println("Perimetro do Losango: " + umLosango.obterPerimetro());
        System.out.println("Perimetro do Quadrado: " + umQuadrado.obterPerimetro());
        System.out.println("Perimetro do Triangulo: " + umTriangulo.obterPerimetro() + "\r\n");
        
        /**
         * Altura dos Elementos
         */
        System.out.println("|| Calculo de Altura ||");
        System.out.println("Altura do Circulo: " + umCirculo.obterAltura());
        System.out.println("Altura do Losango: " + umLosango.obterAltura());
        System.out.println("Altura do Quadrado: " + umQuadrado.obterAltura());
        System.out.println("Altura do Triangulo: " + umTriangulo.obterAltura() + "\r\n");
        
        
        
        /**
         * Calculo de Lado dos Elementos
         */
        System.out.println("|| Calculo de Lados ||");
        System.out.println("Lado do Circulo: " + umCirculo.obterNumeroLados());
        System.out.println("Lado do Losango: " + umLosango.obterNumeroLados());
        System.out.println("Lado do Quadrado: " + umQuadrado.obterNumeroLados());
        System.out.println("Lado do Triangulo: " + umTriangulo.obterNumeroLados());
        
        
    }
    
    
}

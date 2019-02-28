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
public class Quadrado implements FiguraGeometrica {

    private final Double lado;
    private Double area;

    public Quadrado(Double lado) {
        this.lado = lado;

    }

    private Double getLado() {
        return lado;
    }

    private Double getArea() {
        return this.area = this.getLado() * this.getLado();
    }

    @Override
    public Double obterArea() {
       return this.getArea();
    }

    @Override
    public Double obterPerimetro() {
        return null;
    }

    @Override
    public Double obterAltura() {
        return null;
    }

    @Override
    public Double obterNumeroLados() {
        return null;
    }

}

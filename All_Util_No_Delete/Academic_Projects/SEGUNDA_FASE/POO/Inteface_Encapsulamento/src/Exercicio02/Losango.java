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
public class Losango implements FiguraGeometrica {

    private final Double altura;
    private final Double base;
    private Double area;

    public Losango(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }

    private Double getAltura() {
        return altura;
    }

    private Double getArea() {
        return (this.getBase() * this.getAltura()) / 2;
    }

    private Double getBase() {
        return base;
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

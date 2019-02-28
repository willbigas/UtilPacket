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
public class Triangulo implements FiguraGeometrica {

    private final Double base;
    private final Double altura;
    private Double area;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    private Double getBase() {
        return base;
    }

    private Double getAltura() {
        return altura;
    }

    private Double getArea() {
        return this.area = (this.getBase() * this.getAltura()) / 2;
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

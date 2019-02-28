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
public class Circulo implements FiguraGeometrica {

    
    /**
     * Atributos
     */
    
    private Double area;
    private Double perimetro;
    private Double raio;
    
    /**
     * Construtor
     * @param area
     * @param perimetro
     * @param raio 
     */

    public Circulo(Double area, Double perimetro, Double raio) {
        this.area = area;
        this.perimetro = perimetro;
        this.raio = raio;
    }
    
    /**
     * Getters
     * @return 
     */

    private Double getArea() {
        return this.area = 3.14 * (this.getPerimetro() * this.getPerimetro());
    }

    private Double getPerimetro() {
        return this.perimetro = (2 * 3.14) * this.getRaio();
    }

    private Double getRaio() {
        return raio;
    }
    
    /**
     * Sobrescrevendo Metodos de Figura Geometrica
     * @return 
     */

    @Override
    public Double obterArea() {
        return this.getArea();
    }

    @Override
    public Double obterPerimetro() {
        return this.getPerimetro();

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

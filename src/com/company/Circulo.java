package com.company;

public class Circulo extends Figuras {
    private double radio;
    private double diametro;
    static final double pi = 3.1415;

    public Circulo(double r, double d){
        super("Circulo");
        radio = r;
        diametro = d;
    }

    public void setArea(){
        this.area = pi * radio * radio;
    }

    public void setPerimetro(){
        this.perimetro = 2 * pi * radio; 
    }

    public void dibujar(){
        super.dibujar();
        System.out.println();
        }
}

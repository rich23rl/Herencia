package com.company;

public class Rombo extends Figuras {
    private double diagonal1;
    private double diagonal2;
    private double lado;

    public Rombo(double d1, double d2, double l){
        super("Rombo");
        diagonal1 = d1;
        diagonal2 = d2;
        lado = l;
    }

    public void setArea(){
        this.area = (diagonal1 * diagonal2)/2;
    }

    public void setPerimetro(){
        this.perimetro = 4 * lado;
    }

    public void dibujar(){
        super.dibujar();
        System.out.println();
    }
}

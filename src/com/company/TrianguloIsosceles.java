package com.company;

public class TrianguloIsosceles extends Triangulo {
    private double base;
    private double lado;

    public TrianguloIsosceles(double b,double lado1){
        super("Triangulo Isosceles");
        base = b;
        lado = lado1;
    }

    public void setArea(){
        this.area = (lado * Math.sqrt((lado * lado) - (lado * lado)/4))/2;
    }

    public void setPerimetro(){
        this.perimetro = (2 * lado) + base;
    }

    public void dibujar(){
        super.dibujar();
        System.out.println();
    }
}

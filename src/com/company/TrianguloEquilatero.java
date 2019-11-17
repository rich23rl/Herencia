package com.company;

public class TrianguloEquilatero extends Triangulo {
    private double base;
    private double lado;


    public TrianguloEquilatero(double b,double lado1){
        super("Triangulo Equilatero");
        base = b;
        lado = lado1;
    }

    public void setArea(){
        this.area = (Math.sqrt(3))/4 * lado * lado;
    }

    public void setPerimetro(){
        this.perimetro = 3 * lado;
    }

    public void dibujar(){
        super.dibujar();
        System.out.println();
    }
}

package com.company;

public class Cuadrado extends Figuras{
    private double lado;

    public Cuadrado(double l) {
        super("Cuadrado ");
        lado = l;
    }

    public void setArea(){
        this.area = lado*lado;
    }

    public void setPerimetro(){
        this.perimetro = lado * 4;
    }

    public void dibujar(){
        super.dibujar();
        System.out.println("Dibujo:");
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++)
                System.out.print("*");
                System.out.println();
        }
    }
}



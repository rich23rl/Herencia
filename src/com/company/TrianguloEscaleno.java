package com.company;

public class TrianguloEscaleno extends Triangulo {
    private double base;
    private double altura;
    private double l1,l2,l3;

    public TrianguloEscaleno(double b,double a,double lado1,double lado2,double lado3){
        super("Triangulo Escaleno");
        base = b;
        altura = a;
        l1 = lado1;
        l2 = lado2;
        l3 = lado3;
    }

    public void setArea(){
        this.area = (base * altura) / 2;
    }

    public void setPerimetro(){
        this.perimetro = l1 + l2 + l3;
    }

    public void dibujar(){
        super.dibujar();
        System.out.println();
    }
}

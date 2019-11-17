package com.company;

public class Trapecio extends Figuras{
    private double base1;
    private double base2;
    private double altura;
    private double lado1;
    private double lado2;

    public Trapecio(double b1, double b2, double a, double l1, double l2){
        super("Trapecio");
        base1 = b1;
        base2 = b2;
        altura = a;
        lado1 = l1;
        lado2 = l2;
    }

    public void setArea(){
        this.area = ((base1 + base2) * altura)/2;
    }

    public void setPerimetro(){
        this.perimetro = base1 + base2 + lado1 + lado2;
    }

    public void dibujar(){
        super.dibujar();
        System.out.println();
    }
}

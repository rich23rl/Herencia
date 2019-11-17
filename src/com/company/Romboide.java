package com.company;

public class Romboide extends Figuras{
    private double base;
    private double altura;

    public Romboide(double b, double a) {
        super("Romboide");
    }

    public void setArea(){
        this.area = base * altura;
    }

    public void setPerimetro(){
        this.perimetro = 2 * (base + altura);
    }

    public void dibujar(){
        super.dibujar();
        System.out.println();
    }
}

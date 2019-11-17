package com.company;

public class Paralelogramo extends Figuras {
    private double base;
    private double altura;

    public Paralelogramo(double b, double a) {
        super("Paralelogramo");
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

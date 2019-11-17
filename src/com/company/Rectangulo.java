package com.company;

public class Rectangulo extends Figuras {
    private double base;
    private double altura;

    public Rectangulo(double b, double a){
        super("Rectangulo");
        base = b;
        altura = a;
    }

    public void setArea(){
        this.area = base * altura;
    }

    public void setPerimetro(){
        this.perimetro = (base * 2) + (altura * 2);
    }

    public void dibujar(){
        super.dibujar();
        System.out.println("Dibujo: ");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++)
                System.out.print("*");
                System.out.println();
        }
    }
}

package com.company;

public abstract class Figuras {
    protected double area;
    protected String nombre;
    protected double perimetro;

    public String getNombre() {
        return nombre;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public Figuras(String n){
        nombre = n;
    }

    public void dibujar(){
        System.out.println("Nombre: " +this.getNombre());
        System.out.println("Perimetro: " +this.getPerimetro());
        System.out.println("Area: " +this.getArea());
    }

}

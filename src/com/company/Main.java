package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion;
        do{
            System.out.println("\t MENU ");
            System.out.println("1. Cuadrado \n2. Recatangulo \n3. Triangulo \n4. Circulo");
            System.out.println("5. Trapecio \n6. Rombo \n7. Romboide \n8. Paralelogramo \n9. Salir");
            opcion = entrada.nextInt();

            double wlado, walt, wbas, wrad, wdia, wd1, wd2, wl;
            double ba1, ba2, al, l1, l2, ba, alt, base, altura;

            if (opcion == 1) {
                System.out.println("Lado del Cuadrado: ");
                wlado = entrada.nextDouble();
                Cuadrado objcuad = new Cuadrado(wlado);
                objcuad.setArea();
                objcuad.setPerimetro();
                objcuad.dibujar();
            }else{
                if (opcion == 2) {
                    System.out.println("Base del Rectangulo: ");
                    wbas = entrada.nextDouble();
                    System.out.println("Altura del Rectangulo: ");
                    walt = entrada.nextDouble();
                    Rectangulo objrect = new Rectangulo(wbas,walt);
                    objrect.setArea();
                    objrect.setPerimetro();
                    objrect.dibujar();
                }else{
                    if (opcion == 3) {
                        int opcionn;
                        do{
                            System.out.println("\t Menu Triangulo");
                            System.out.println("\n1. Triangulo Escaleno \n2. Triangulo Equilatero \n3. Triangulo Isosceles \n4. Salir");
                            opcionn = entrada.nextInt();

                            double wba, wal, wl1, wl2, wl3, xla, xbas, ybas, yla;

                            if (opcionn == 1) {
                                System.out.println("Base del Triangulo Escaleno: " );
                                wba = entrada.nextDouble();
                                System.out.println("Altura del Triangulo Escaleno: ");
                                wal = entrada.nextDouble();
                                System.out.println("Lados del Trinagulo Escaleno: ");
                                wl1 = entrada.nextDouble();
                                wl2 = entrada.nextDouble();
                                wl3 = entrada.nextDouble();
                                TrianguloEscaleno objtriEs = new TrianguloEscaleno(wba,wal,wl1,wl2,wl3);
                                objtriEs.setArea();
                                objtriEs.setPerimetro();
                                objtriEs.dibujar();
                            }else{
                                if (opcionn == 2) {
                                    System.out.println("Base del Triangulo Equilatero: ");
                                    ybas = entrada.nextDouble();
                                    System.out.println("Lados del Trinagulo Equilatero: ");
                                    yla = entrada.nextDouble();
                                    TrianguloEquilatero objtriEqui = new TrianguloEquilatero(ybas,yla);
                                    objtriEqui.setArea();
                                    objtriEqui.setPerimetro();
                                    objtriEqui.dibujar();
                                }else{
                                    if (opcionn == 3) {
                                        System.out.println("Base del Triangulo Isosceles: ");
                                        xbas = entrada.nextDouble();
                                        System.out.println("Lados del Trinagulo Isosceles: ");
                                        xla = entrada.nextDouble();
                                        TrianguloIsosceles objtriIsos = new TrianguloIsosceles(xbas,xla);
                                        objtriIsos.setArea();
                                        objtriIsos.setPerimetro();
                                        objtriIsos.dibujar();
                                    }
                                }
                            }
                        }while (opcionn < 3);

                    }else{
                        if (opcion == 4) {
                            System.out.println("Radio del Circulo: ");
                            wrad = entrada.nextDouble();
                            System.out.println("Diametro del Circulo: ");
                            wdia = entrada.nextDouble();
                            Circulo objcir = new Circulo(wdia,wrad);
                            objcir.setArea();
                            objcir.setPerimetro();
                            objcir.dibujar();
                        }else{
                            if (opcion == 5) {
                                System.out.println("Base del Trapecio: ");
                                ba1 = entrada.nextDouble();
                                System.out.println("Base 2 del Trapecio: ");
                                ba2 = entrada.nextDouble();
                                System.out.println("Altura del Trapecio: ");
                                al = entrada.nextDouble();
                                System.out.println("Lado del Taprecio: ");
                                l1 = entrada.nextDouble();
                                System.out.println("Lado 2 del Taprecio: ");
                                l2 = entrada.nextDouble();
                                Trapecio objtra = new Trapecio(ba1,ba2,al,l1,l2);
                                objtra.setArea();
                                objtra.setPerimetro();
                                objtra.dibujar();
                            }else{
                                if (opcion == 6) {
                                    System.out.println("Diagonal 1 del Rombo: ");
                                    wd1 = entrada.nextDouble();
                                    System.out.println("Diagonal 2 del Rombo: ");
                                    wd2 = entrada.nextDouble();
                                    System.out.println("Lados del Rombo: ");
                                    wl = entrada.nextDouble();
                                    Rombo objrom = new Rombo(wd1,wd2,wl);
                                    objrom.setArea();
                                    objrom.setPerimetro();
                                    objrom.dibujar();
                                }else{
                                    if (opcion == 7) {
                                        System.out.println("Base del Romboide: ");
                                        ba = entrada.nextDouble();
                                        System.out.println("Altura del Romboide: ");
                                        alt = entrada.nextDouble();
                                        Romboide objromb =  new Romboide(ba,alt);
                                        objromb.setArea();
                                        objromb.setPerimetro();
                                        objromb.dibujar();
                                    }else{
                                        if (opcion == 8) {
                                            System.out.println("Base del Paralelogramo: ");
                                            base = entrada.nextDouble();
                                            System.out.println("Altura del Paralelogramo: ");
                                            altura = entrada.nextDouble();
                                            Paralelogramo objpara = new Paralelogramo(base,altura);
                                            objpara.setArea();
                                            objpara.setPerimetro();
                                            objpara.dibujar();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }while (opcion < 8);
    }
}
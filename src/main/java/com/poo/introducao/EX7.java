package com.poo.introducao;
import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = Scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = Scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = Scanner.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = Scanner.nextDouble();

        double nota_media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("Sua media é " + nota_media);
        Scanner.close();
    }
}

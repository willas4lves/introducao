package com.poo.introducao;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite a largura do terreno em metros: ");
        double largura = Scanner.nextDouble();
        System.out.println("Digite o comprimento do terreno em metros: ");
        double comprimento = Scanner.nextDouble();
        System.out.println("Digite o valor do terreno por metro quadrado: ");
        double metrospor2 = Scanner.nextDouble();
        double area = largura * comprimento;
        double Total = area * metrospor2;
        System.out.printf("A área do terreno é m² " + area +"o valor total é R$" + Total);

        Scanner.close();
    }
}

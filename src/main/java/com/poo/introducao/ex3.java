package com.poo.introducao;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("\"Digite o valor em reais: \"");
        double valorReais = Scanner.nextDouble();
        double valorconvertido = 5.25;

        double valorDolares = valorReais / valorconvertido;

        System.out.printf("O valor em dólares é: $%.2f%n", valorDolares);

        Scanner.close();

    }
}

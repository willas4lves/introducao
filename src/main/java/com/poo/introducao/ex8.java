package com.poo.introducao;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: " );
        double fahrenheit = Scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("A temperatura em Celsius é: %.2f%n", celsius);

        Scanner.close();
    }
    
}

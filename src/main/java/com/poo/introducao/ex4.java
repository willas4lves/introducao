package com.poo.introducao;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = Scanner.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("O antecessor de " + numero + " é " + antecessor + " e o sucessor é " + sucessor + ".");

        Scanner.close();
    }
    
}

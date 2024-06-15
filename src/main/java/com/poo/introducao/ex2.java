package com.poo.introducao;
import java.util.Scanner;



public class ex2 {


    public static void main(String[] args){
        String nome;
        String sobrenome;
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        nome = Scanner.nextLine();
        System.out.println("Digite seu sobrenome");
        sobrenome = Scanner.nextLine();



        System.out.println("Olá " + nome + " " + sobrenome + "!");
        Scanner.close();

    }
    
}

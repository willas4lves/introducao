package com.poo.introducao;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite a distância percorrida em km: ");
        double distância_percorrida = Scanner.nextDouble();
        System.out.println("Digite o total de combustível gasto em litros: ");
        double combustívelgasto = Scanner.nextDouble();

        double consumo_medio = distância_percorrida / combustívelgasto;
        System.out.printf("O consumo médio do veículo é "+ consumo_medio + "km/h");


        Scanner.close();

    }
}

package Exercicios.exercicios.repeticao;

/* 5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses 
números. */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, numero, soma;
        i = 1;
        soma = 0;
        while (i <= 10) {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            i++;
        }
        System.out.println("A soma dos números digitados é: " + soma);
    }
}
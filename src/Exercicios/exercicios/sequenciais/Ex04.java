package Exercicios;

import java.util.Scanner;

/* Desenvolva um algoritmo que leia dois números inteiros e mostre o
somatório entre eles */
public class Ex04 {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um valor:");
    int numero1 = scan.nextInt();

    System.out.println("Digite outro valor:");
    int numero2 = scan.nextInt();

    int soma = numero1 + numero2;
    System.out.println("Soma: " + soma);
    System.out.println("---------------------------");
    System.out.println("Soma: " + (numero1 + numero2));

    scan.close();
   } 
}
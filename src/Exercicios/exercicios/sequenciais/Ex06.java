package Exercicios;

import java.util.Scanner;

/* Faça um programa que leia um número inteiro e mostre o seu antecessor
e seu sucessor */
public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num1 = scan.nextInt();

        int antecessor = num1 - 1;
        int sucessor = num1 + 1;

        System.out.println("-----------------------");
        System.out.println("Antecessor: " + antecessor + " Seu número: " + num1 + " Sucessor: " + sucessor);

        scan.close();
    }
}
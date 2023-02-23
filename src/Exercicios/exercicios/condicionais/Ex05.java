package Exercicios.exercicios.condicionais;

import java.util.Scanner;

/* Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO */
public class Ex05 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Digite um ano para saber se é bissexto");
      int ano = scan.nextInt();

      if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)) {
         System.out.println(" Ano é bissexto!");
      } else {
         System.out.println("Ano não é bissexto!");
      }
   }
}
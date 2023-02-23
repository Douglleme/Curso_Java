package Exercicios.exercicios.repeticao;

/* Leia o nome do usuário e escreva o nome dele na tela 10 vezes.  */

import java.util.Scanner;

public class Ex03 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int i, nome;
      i = 1;
         while (i <= 10) {
         System.out.println("Digite seu nome ");
         nome = scan.nextInt();
         i++;
      }
   }

}
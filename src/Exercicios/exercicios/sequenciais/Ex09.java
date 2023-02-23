package Exercicios.exercicios.sequenciais;

import java.util.Scanner;
/* Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira
(em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45 */
public class Ex09 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        
        double valorEmDolar, valorEmReal;
        
        System.out.print("Digite o valor em Dolar: ");
        
        valorEmDolar = teclado.nextDouble();
        
        valorEmReal = valorEmDolar * 3.45;
        
        System.out.print("O valor em Real é: " + valorEmReal);       
    }    
}
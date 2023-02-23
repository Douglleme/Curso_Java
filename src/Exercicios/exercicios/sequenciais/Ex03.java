package Exercicios.exercicios.sequenciais;

import javax.swing.JOptionPane;

/* Crie um programa que leia o nome e o salário de um funcionário, mostrando no final
uma mensagem. */
public class Ex03 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário?"));

        JOptionPane.showInputDialog("Olá " + nome + "é um prazer te conhecer!" + "\nO salário digitado foi: " + salario);
    }
}
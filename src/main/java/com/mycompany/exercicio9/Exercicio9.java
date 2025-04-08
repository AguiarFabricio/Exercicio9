/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio9;

/**
 *
 * @author Fabricio de Aguiar
 */
/**Escreva um programa em JAVA que solicite ao usuário o seu
peso(aqui entenda massa) em Kg (int) e a sua altura em metros
(Double). Com estes dados calcule o IMC – Índice de Massa
Corporal. Seguindo a seguinte fórmula.
IMC = massa / (altura * altura )
Mostre o resultado em uma mensagem.*/

import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        String pesoStr = JOptionPane.showInputDialog("Digite seu peso (kg):");
        double peso = Double.parseDouble(pesoStr);
        String alturaStr = JOptionPane.showInputDialog("Digite sua altura em metros:");
        double altura = Double.parseDouble(alturaStr);
        double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, String.format("Seu IMC é: %.2f", imc));
    }
}
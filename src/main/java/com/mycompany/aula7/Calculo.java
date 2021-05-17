/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula7;

import javax.swing.JOptionPane;

/**
 *
 * @author kaiop
 */
public class Calculo {

    public void soma() {
       int a = Integer.parseInt(JOptionPane.showInputDialog("Valor A"));
       int b = Integer.parseInt(JOptionPane.showInputDialog("Valor B"));
       int resultado = a+b;
       JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
    }

    public int soma(int a, int b) {
        return a+b;

    }
    public int soma(int a, int b, int c) {
        return a+b+c;
    }
}

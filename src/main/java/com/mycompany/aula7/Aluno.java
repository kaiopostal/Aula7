/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula7;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kaiop
 */
public class Aluno {

    public void cadastrarAluno() {

        String a[] = new String[5];
        String m[] = {"Matematica", "Portugues", "Geografia", "Fisica", "Ciencias"};

        for (int i = 0; i < a.length; i++) {
            a[i] = JOptionPane.showInputDialog("Aluno: " + i);
        }
        for (String aluno : a) {
            System.out.println(aluno.toUpperCase());
        }

    }

    public void Atv1() {
        String mate[] = {"Matematica", "Portugues", "Geografia", "Fisica", "Historia"};
        double nota[] = new double[5];
        String result = "";
        double media = 0;
        double soma;
        for (int i = 0; i < mate.length; i++) {
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota de : " + mate[i]));
            result += mate[i] + ":" + nota[i] + "\n";
        }
        //ATV2
        for (int i = 0; i < nota.length; i++) {
            soma = nota[i];
            media += nota[5] / 5.0;
            JOptionPane.showMessageDialog(null, "Voce recebeu a nota " + nota[i] + " em " + mate[i] + "\n" + " e sua media é: " + media);
        }

        //ATV3
    }

    public void Atv3() {

        String mate[] = {"matematica é nota 7", "Portugues nota 8", "Geografia nota 8", "Fisica nota 6", "Historia nota 10"};
        String[] materia = new String[5];
        
        Scanner ler = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Informe o codigo para a materia do qual você deseja saber a nota: " + "\n" + "Mat=0,Port=1,Geo=2,Fis=3,Hist=4 ");
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo: "));
        if (cod == 0) {
            JOptionPane.showMessageDialog(null, mate[0]);
        } else if (cod == 1) {
            JOptionPane.showMessageDialog(null, mate[1]);
        } else if (cod == 2) {
            JOptionPane.showMessageDialog(null, mate[2]);
        } else if (cod == 3) {
            JOptionPane.showMessageDialog(null, mate[3]);
        } else if (cod == 4) {
            JOptionPane.showMessageDialog(null, mate[4]);
        } else {
            JOptionPane.showMessageDialog(null, "Codigo nao encontrado! ");
        }

    }
}

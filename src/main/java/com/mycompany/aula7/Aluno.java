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
    
      public void Atv1(){
          String mate[] = {"Matematica", "Portugues", "Geografia", "Fisica", "Historia"};
          double nota[] = new double[5];
          
          for (int i = 0; i < mate.length; i++) {
              nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota de: " + mate[i]));
              
          }
          
          
          
          
      }
}

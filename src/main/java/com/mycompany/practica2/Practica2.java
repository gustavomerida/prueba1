
package com.mycompany.practica2;

import javax.swing.JOptionPane;

public class Practica2 {
    
    //Esto es un comentario
    public static void main(String[] args) {
        String nro;
        int num;
        
        do{
            nro = JOptionPane.showInputDialog("Escribe un número");
            num = Integer.parseInt(nro);
        }while (num!=-1);
      
    }
}

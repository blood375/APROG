/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import javax.swing.JOptionPane;
import java.util.Scanner;


/**
 *
 * @author claudio
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valorlido, qtdValores = 1;
        
        System.out.println("Valor?");
        valorlido=input.nextInt();
        while(eCapicua(valorlido)==false && qtdValores < QTD_TENTATIVAS){
            System.out.println("Valor");
            valorlido=input.nextInt();
            qtdValores++;
        }
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6_1;

/**
 *
 * @author Francisco
 */
import javax.swing.JOptionPane;
public class PL6_1 {
    
    /**
     * @param args the command line arguments
     * 
     * a) Ambos os metodos verificam se a string indicada é palíndromo 
     * e retorna um valor boleano true ou false.
     * 
     * 
     */
    
    public static boolean metodo1 (String pal) { 
        boolean resposta = true;
        pal = pal.toLowerCase();
        int tamanho = pal.length();
        for (int i=0 ;  i< tamanho /2 ;  i++) 
        { 
            if (pal.charAt(i) != pal.charAt(tamanho - 1 - i)) {
                resposta = false; break; 
            }
        }
        return resposta; 
}
 

    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean palindromo;
        String palavra;
        int cont=0;
        
        do
        {
         palavra=JOptionPane.showInputDialog("indique uma palavra");
         palindromo=metodo1(palavra);
         cont++;   
        }while(palindromo==false);
        
        if(cont==1){
            JOptionPane.showMessageDialog(null,"A primeira palavra que indicou é uma palíndromo");
        }else{
            JOptionPane.showMessageDialog(null,"Foram lidas "+(cont-1)+" palavras antes de indicar a palíndromo");
        }
        
    }
    
}

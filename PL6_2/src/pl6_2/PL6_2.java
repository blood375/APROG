/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6_2;

/**
 *
 * @author claudio
 */

import javax.swing.JOptionPane;
public class PL6_2 {

    
    public static String graficobarras(int quantidade){
        
        String asteriscos;
        
        asteriscos="";
        
        
        do{
            
            asteriscos=asteriscos+("*");
            quantidade--;
        }while(quantidade>0);
        
        return asteriscos;
        
 
                
        
    }
    
    
    
    public static void main(String[] args) {
        
                
        int positivas, negativas, fim;
        String aux, disciplina,stringpos,stringnes;
        
        
        do{
        aux=JOptionPane.showInputDialog("Quantas disciplinas?");
        fim=Integer.parseInt(aux);
        }while(fim<=0);
        do{
        
            disciplina=JOptionPane.showInputDialog("Nome da disciplina?");
        
        
        
            aux=JOptionPane.showInputDialog("Quantas positivas esta disciplina teve?");
            positivas=Integer.parseInt(aux);
            aux=JOptionPane.showInputDialog("Quantas negativas esta disciplina teve?");
            negativas=Integer.parseInt(aux);
        
        
            stringpos=graficobarras(positivas);
            stringnes=graficobarras(negativas);
            
                    
                
            JOptionPane.showMessageDialog(null, "Disciplina: "+disciplina+"\n"+"- Positivas: "+stringpos+"\n"+"- Negativas: "+stringnes);
            fim--;
        }while(fim>0);
                 
        
        
        
        
    }
    
}

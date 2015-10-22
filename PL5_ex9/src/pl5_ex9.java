/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco
 */
import static java.lang.Math.pow;
import javax.swing.JOptionPane;

public class pl5_ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int novo=0,exp=0,c;
        Double dig,num;
        String aux;
        do
        {    
            c=0;
            aux= JOptionPane.showInputDialog("Indique um número em binário");
            num= Double.parseDouble(aux);

            while((num!=0)&&(c==0))
            {
                dig= num%10;
                if(dig<=1)
                {
                    novo=(int) (novo+ dig*pow(2,exp));
                    exp++;
                    num=(num-dig)/10;
                }else
                {
                    c=1;
                }        
            }
            if(c==1)
            {
                JOptionPane.showMessageDialog(null,"Indique um número binário");
            }else
            {    
                JOptionPane.showMessageDialog(null,"O novo número é: "+novo);
            }
        }while(c==1);
    }
    
}

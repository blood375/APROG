
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco
 */
public class pl5_ex7 {

    /**
     * Sabendo 2 números queremos testar N vezes números que sejam divisiveis pelo
     * número mais pequeno(dos 2 primeiros números indicados) e divisor do maior
     * número (dos 2 primeiros números indicados).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,aux,num,c,d,e;
        String auxstring;
        
        auxstring= JOptionPane.showInputDialog("indique um número");
        a=Integer.parseInt(auxstring);
        
        auxstring= JOptionPane.showInputDialog("indique outro número");
        b=Integer.parseInt(auxstring);
        
        if(a>b)
        {
            aux=a;
            a=b;
            b=aux;            
        }
        e=0;
        do{
            auxstring= JOptionPane.showInputDialog("Quantos números quer testar?");
            d=Integer.parseInt(auxstring);
        }while(d<=0);
        
        for(c=1;c<=d;c++)
        {
            do{
                auxstring= JOptionPane.showInputDialog("Indique um numero");
                num=Integer.parseInt(auxstring);
            }while(num<=0);
            if(num%a==0 && b%num==0)
            {
                e++;
            }
            
        }
        JOptionPane.showMessageDialog(null,"Dos números indicados "+e+" são divisiveis de "+a+" e divisores de "+b);
        
    }
    
}

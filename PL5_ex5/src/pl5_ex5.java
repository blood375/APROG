/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * a) O algoritmo tem como função ler um número
 * e voltar a escrevê-lo com apenas os algarismos
 * impares.
 * @author Francisco
 */
import javax.swing.JOptionPane;
public class pl5_ex5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       
		int num, d, aux= 1, res= 0;		
                String auxstring;

		auxstring = JOptionPane.showInputDialog("indique um número");
                num = Integer.parseInt(auxstring);

		while (num != 0) {
			d = num % 10;

			if (d % 2 == 1) {
				res = res + d * aux;
				aux = aux * 10;
			}
			num = num / 10;
		}
		
		JOptionPane.showMessageDialog(null,"O resultado é :" + res);
        
        
    }
    
}

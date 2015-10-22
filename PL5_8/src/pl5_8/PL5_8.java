package pl5_8;

//@author claudio
import javax.swing.JOptionPane;
public class PL5_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int digito, numero, naobinario;
               
        
        naobinario=0;
        do{
        String aux;
        aux=JOptionPane.showInputDialog("Escreva o numero");
        numero=Integer.parseInt(aux);
        }while(numero<0);
        
        do {
            
            digito=numero%10;
            numero=numero/10;
            
            if(digito!=1 && digito!=0){
                naobinario++;              
            }
            
         
        }while (numero != 0 && naobinario==0);
        
        if(naobinario>0){
            JOptionPane.showMessageDialog(null, "O numero que indicou nao é binario");            
        }else{
            JOptionPane.showMessageDialog(null, "O numero que indicou é binario");
        }
        
    }   
        
}

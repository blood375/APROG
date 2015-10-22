package pl5_10;

//@author claudio
import javax.swing.JOptionPane;
public class PL5_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero, backup, digito, test;
        String resultado, aux;
        
        do{
        aux=JOptionPane.showInputDialog("Qual numero?");
        numero=Integer.parseInt(aux);
        }while(numero<0);
        
        resultado="";
        backup=numero;
        
        if (numero==0){
            JOptionPane.showMessageDialog(null, "O numero 0 em binario é 0");
        }else{
            while(numero!=0){
                digito=numero%2;
                resultado=digito+resultado;
                numero=numero/2;
            }
        }
            
        JOptionPane.showMessageDialog(null,"O numero "+backup+" em binario é "+resultado);
        
       
        
    }
    
}

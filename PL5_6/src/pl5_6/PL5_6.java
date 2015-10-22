package pl5_6;

//@author claudio
import javax.swing.JOptionPane;
public class PL5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=0,numero,test=0,quantpares1=0,quantpares2=0;
        String aux;
        //PRIMEIRA SEQUENCIA
        do{
            cont++;
            do{
            aux=JOptionPane.showInputDialog("Primeria Sequencia- Qual o "+cont+"º numero?(Insira 0 para acabar a leitura)");
            numero=Integer.parseInt(aux);
            }while(numero<0);
            if(numero!=0 && numero%2==0){
                quantpares1++;
            }
                        
        }while(numero!=0);
        
        cont=0;
        //SEGUNDA SEQUENCIA
        do{
            cont++;
            do{
            aux=JOptionPane.showInputDialog("Segunda Sequencia- Qual o "+cont+"º numero?(Insira -1 para acabar a leitura)1");
            numero=Integer.parseInt(aux);
            }while(numero<-1 || numero==0);
            if(numero!=0 && numero%2==0){
                quantpares2++;
            }
                        
        }while(numero!=-1);
        
        if(quantpares1>quantpares2){
            JOptionPane.showMessageDialog(null,"A primeira sequencia é a que tem mais numeros pares");
        }else{
            if(quantpares2>quantpares1){
                JOptionPane.showMessageDialog(null,"A segunda sequencia é a que tem mais numeros pares");
            }else{
                JOptionPane.showMessageDialog(null, "As duas sequencias tem a mesma quantidade de numeros pares");
            }
        }
          
    }
    
}

package pl5_3;

//@author xavier
import javax.swing.JOptionPane;
public class PL5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade,x=0;
        double contador=0,soma=0;
        String nome,aux;
        
        do{
            nome=JOptionPane.showInputDialog("Indique um Nome");
           
            if(nome.equalsIgnoreCase("zzz"))
            {
                x=1;
            }else{ 
                    do{
                        aux=JOptionPane.showInputDialog("Indique a idade do aluno.");
                        idade=Integer.parseInt(aux);
                      }while(idade<=0);
                    if(idade>=18)
                    {   
                        soma++;                        
                    }
                  JOptionPane.showMessageDialog(null,"A pessoa chama-se "+nome+" e tem "+idade+" anos de idade");
                   contador++; 
                }
                   
        }while(x!=1);
        if(contador!=0)
        {
            JOptionPane.showMessageDialog(null,"A percentagem de pessoas maiores ou igual que 18 é "+(soma/contador)*100+" %");
        }else
        {
            JOptionPane.showMessageDialog(null,"Não indicou nenhum nome válido");
        
        }
        
        
    }
    
}

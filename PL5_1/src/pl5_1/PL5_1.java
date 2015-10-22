package pl5_1;

//@author xavier
import javax.swing.JOptionPane;
public class PL5_1 {

    /**
     * a) De N numeros o objectivo do exercicio é calcular a media e percentagem
     * dos numeros pares intruduzidos pelo utilizador. 
     * 
     * ESCREVER("NÃO EXISTE NUMEROS PARES")
     */
    public static void main(String[] args) {
        double contador=0,media,soma=0,n,i,num;
        
        String temp;
        do{
            temp=JOptionPane.showInputDialog("Quantos numeros vai indicar?");
            n=Double.parseDouble(temp);
        }while(n<=0);

        
        for(i=1;i<=n;i++){
            temp=JOptionPane.showInputDialog("Indique um numero");
            num=Double.parseDouble(temp);
        
            if (num%2==0){
            contador++;
            soma=soma+num;
            
            }
        }
        if(contador!=0){
            media=soma/contador;
            JOptionPane.showMessageDialog(null,"Media="+media+" Percentagem="+contador/n);
        }else{
            JOptionPane.showMessageDialog(null,"Nao indicou nenhum numero par");
        }
    }
}
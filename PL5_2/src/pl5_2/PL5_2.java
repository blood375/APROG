package pl5_2;

//@author claudio
import javax.swing.JOptionPane;
public class PL5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ED:        
        int n,temp,tempant,maximo=0,i;
        String aux;
        //LER
        do {
        aux=JOptionPane.showInputDialog("Quantos dias deseja introduzir a temperatura?");
        n=Integer.parseInt(aux);
        }while(n<=0);
        //PARA
        aux=JOptionPane.showInputDialog("Qual a temperatura?");
        tempant=Integer.parseInt(aux);
        maximo=tempant;
        for(i=1;i<=(n-1);i++){
            aux=JOptionPane.showInputDialog("Qual a temperatura?");
            temp=Integer.parseInt(aux);


            if(temp>tempant){
                maximo=temp;
            }   
            tempant=temp;      
        }     
        if(maximo<-30){
        JOptionPane.showMessageDialog(null,"A Temperatura do dia mais quente foi extrema");
        }else{
            if(maximo<9){
                JOptionPane.showMessageDialog(null,"A Temperatura do dia mais quente foi muito fria");
            }else{
                if(maximo<15){
                    JOptionPane.showMessageDialog(null,"A Temperatura do dia mais quente foi fria");
                }else{
                    if(maximo<20){
                        JOptionPane.showMessageDialog(null,"A Temperatura do dia mais quente foi amena");
                    }else{
                        if(maximo<30){
                            JOptionPane.showMessageDialog(null,"A Temperatura do dia mais quente foi quente");
                        }else{
                            if(maximo<50){
                            JOptionPane.showMessageDialog(null,"A Temperatura do dia mais quente foi muito quente");
                            }else{
                            JOptionPane.showMessageDialog(null,"A Temperatura do dia mais quente foi extrema");
                            }
                        }                 
                    }
                }
            }
        }
    
     /** Pseudo Code
     * ALG
     * INICIO
     * tempant=-10000000000
     * LER(n)
     * PARA (i=1;i<=n;i++)FAZER
     * LER(temp)
     * SE(temp>tempant)ENTAO
     * maximo=temp
     * FIMSE
     * tempant=temp
     * FIMPARA
     * SE(maximo <=-30)ENTAO
     * ESCREVER("Temperatura extrema")
     * SENAO
     *      SE(maximo <9)ENTAO
     *      ESCREVER("Muito Frio")
     *      SENAO
     *          SE(maximo <15)ENTAO
     *          ESCREVER("Frio")
     *          SENAO
     *              SE(maximo <20)ENTAO
     *              ESCREVER("Ameno")
     *              SENAO
     *                  SE(maximo <30)ENTAO
     *                  ESCREVER("Quente")
     *                  SENAO
     *                          SE(maximo <50)ENTAO
     *                          ESCREVER("Muito Quente")
     *                          SENAO
     *                          ESCREVER("Temperatura Extrema")
     * FIM
     */  
    
    }
    
}

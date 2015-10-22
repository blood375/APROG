/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6_6;

/**
 *
 * @author claudio
 */
import java.util.Scanner;
public class PL6_6 {

    public static double cilindro(double r,double a){
        
        double res;
        
        res=(a*Math.pow(r,2)*Math.PI);
        
        return res;
    }
    
    public static double cone (double r, double a){
        
        double res;
        
        res=((1/3)*Math.PI*Math.pow(r,2)*a);
        
        return res;
        
    }
    
    public static double esfera (double r){
        
        double res;
        
        res=((4/3)*Math.PI*Math.pow(r,3));
        
        return res;
        
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fim=0;
        double raio, altura, res;        
        String solido, aux;
        
        do{
            
            Scanner string = new Scanner(System.in);
            Scanner var = new Scanner(System.in);
            System.out.println("Qual o solido? (Cilindro, cone ou esfera)");
            solido = string.next();

            if(solido.equalsIgnoreCase("FIM!") || solido.equalsIgnoreCase("FIM")){
                
                fim=1;
                
            }else{


                if(solido.equalsIgnoreCase("cilindro") || solido.equalsIgnoreCase("cilindros")){

                    do{
                        System.out.println("Qual o raio do cilindro?");
                        aux=var.next();
                        raio=Double.parseDouble(aux);
                        System.out.println("E qual é a altura?");
                        aux=var.next();
                        altura=Double.parseDouble(aux);
                    }while(raio<=0 || altura<=0);
                    
                    res=cilindro(raio,altura);
                    
                    System.out.println("O resultado é: "+res);

                }else{
                    if(solido.equalsIgnoreCase("cone") || solido.equalsIgnoreCase("cones")){

                        do{
                            System.out.println("Qual o raio do cone?");
                            aux=var.next();
                            raio=Double.parseDouble(aux);
                            System.out.println("E qual é a altura?");
                            aux=var.next();
                            altura=Double.parseDouble(aux);
                        }while(raio<=0 || altura<=0);
                        
                        res=cone(raio,altura);
                        
                        System.out.println("O resultado é: "+res);

                    }else{
                        if(solido.equalsIgnoreCase("esfera") || solido.equalsIgnoreCase("esferas")){

                            do{
                                System.out.println("Qual o raio da esfera?");
                                aux=var.next();
                                raio=Double.parseDouble(aux);
                            }while(raio<=0);
                            
                            res=esfera(raio);
                            
                            System.out.println("O resultado é: "+res);

                        }else{
                            System.out.println("Solido introduzido não foi reconhecido");
                        }

                    }
                }

            }
        
        }while(fim<=0);
            
    }
    
}

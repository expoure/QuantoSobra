/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_1;

/**
 *
 * @author dkram
 */
public class QuantoSobra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            if (i%3==0 && i%5==0) {
                System.out.println("QuantoSobra");
            }else{
                if(i%3==0){
                    System.out.println("Quanto");
                }else{
                    if(i%5 == 0){
                        System.out.println("Sobra");
                    }else{
                        System.out.println(i+"");
                    }
                }
            }   
            
            
            
        }
    }
    
}

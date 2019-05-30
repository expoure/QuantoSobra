/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dkram
 */
public class Ultrapassagem {
   
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
    
        System.out.printf("Informe o número de carros:\n");
        int n = ler.nextInt();
        ArrayList<Integer> cars = new ArrayList<Integer>();
        ArrayList<Integer> chegada = new ArrayList<Integer>();
        ArrayList<Integer> aux = new ArrayList<Integer>();
        
        //adicionar os carros numa lista
        System.out.println("Ordem de largada: ");
        for(int i = 0; i < n; i++){
            System.out.println("carro da posição " + i +" é: ");
            cars.add(ler.nextInt());
        }
        aux = cars;
        
        System.out.println("Ordem de chegada: ");
        for(int i = 0; i < n; i++){
            System.out.println("carro da posição " + i +" é: ");
            chegada.add(ler.nextInt());
        }
        
        int count = 0;
        int index = 0;
        int a = 0;
        int b = 0;
        int j = 0;
        while(j < n){
            index = chegada.indexOf(aux.get(j)); //pega a posicao do carrona chegada
            System.out.println("indice: " +index);
            if(index > aux.indexOf(aux.get(j))){ //se 
                count += index - aux.indexOf(cars.get(j));
                b = aux.get(index);
                a = aux.get(j);
                aux.remove(index);
                aux.remove(j);

                aux.add(j, b);
                aux.add(index, a);
                j = 0;
                /*
                for(int k = 0; k < aux.size(); k++){
                    System.out.println(aux.get(k));
                } */
            }else{
                j++;
            }
            
        }
        System.out.println("Minimo de ultrapassagens: "+count);
        
    //algoritmo leva em consideração cada ultrapassagem de acordo com a mudança de "estado".
    //No exemplo 1 a ordem de largada "1 2 3 4 5" com ordem de chegada "3 1 2 5 4" espera no mínimo 3 ultrapassagens.
    //mas vemos que -entre parenteses o número de ultrapassagens no estado: 12345 -> 21345 (1) -> 31254 (2) -> 31254 (1) resultam em 4 ultrapassagens 
        
    }
}

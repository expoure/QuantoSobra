/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_4;

import java.util.Arrays;

/**
 *
 * @author dkram
 */
public class expressaoRegular {
    
    //Pouco conhecimento em expressoes regulares, mas depois de 2 horas foi o melhor que consegui fazer :c
    public static void main(String[] args) {
        String end = "Rua Marechal Floriano, 405 - segundo andar. CEP 96810-002";
        String end2 = "Rua 7 de setembro, 59, apto 302, CEP 96810-016";
        String end3 = "Rua Vinte e Oito de Setembro, 1997, CEP 96814-200";
        boolean teste = end.matches("[R]ua");
        System.out.println(teste);
        
        String parts[] = end.split("\\.|\\,");
        System.out.println(Arrays.toString(parts));
        String parts2[] = end2.split("\\.|\\,");
        System.out.println(Arrays.toString(parts2));
        String parts3[] = end3.split("\\.|\\,");
        System.out.println(Arrays.toString(parts3));
    }
}

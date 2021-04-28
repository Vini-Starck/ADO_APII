// Dada uma matriz quadrada de ordem n, escreva um método para determinar 
// a média de todos os elementos representados pela figura abaixo

package ado_apii;

import java.util.Random;


public class Exercício5 {
    public static void main(String args[]){
        Random rd = new Random();
        System.out.print("=== Exercício 5 ===\n");
        int[][]m = new int[8][8];
        
        
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
               m[i][j] = rd.nextInt(10);
            }
        }
        
        System.out.println("== Matriz ==\n");
        
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        System.out.println("Média: "+media(m));
    }
    
    /**
     * tira a média da diagonal principal e secundaria da matriz
     * @param int[][]m
     * @return media
     */
    public static int media(int[][]m){
        
        int soma=0, cont=0, media=0;
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                if(i+j==m.length-1){ // diagonal secundaria
                    soma += m[i][j];
                    cont += 1;
                }
            }
        }
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
                if(i==j){
                    soma += m[i][j];
                    cont += 1;
                }
            }
        }
        
        System.out.println("soma: "+ soma);
        System.out.println("cont: "+ cont);
        media = soma/cont;
        return media;
        
    }
}
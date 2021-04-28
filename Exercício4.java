// Dada uma matriz mXn de valores reais de simples precisão (float), 
// escreva um algoritmo que determine a soma dos elementos de cada uma das linhas dessa matriz.

package ado_apii;
import java.util.Random;

public class Exercício4 {
    public static void main(String args[]){
        System.out.println("=== Exercício 4 ===\n");
        Random rd = new Random();
        float [][] vet = new float[5][3];
        
        float soma=0;
        
        for(int i=0; i<vet.length; i++){
            for(int j=0; j<vet[i].length; j++){
                vet[i][j]= rd.nextFloat()*10;
                soma+= vet[i][j];
            }
        }
        
        System.out.println("== Matriz ==\n");
        
        for(int i=0; i<vet.length; i++){
            for(int j=0; j<vet[0].length; j++){
                System.out.print(vet[i][j]+" ");
            }
            System.out.print("\n");
        }
    
        System.out.println("\nSoma: "+soma);
    }
}
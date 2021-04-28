// Escreva um método que receba um array unidimensional como parâmetro 
// e retorne a quantidade de valores maiores do que a média aritmética.

package ado_apii;


public class Exercício2 {
    public static void main(String args[]){
        System.out.println("=== Exercício 2 ===\n");
        
        int [] vet = {26,45,32,41,66};
        
        System.out.println("Quantidade de valores maiores que a média: "+media(vet));
    }
    
    /**
     * calcula a media dos valores retorna a quantidade de numeros maiores que a média
     * @param int[]m
     * @return quantidade de numeros maiores que a média
     */
    public static int media(int[] m){
        
        int soma=0;
        int media=0;
        for(int i=0; i<m.length; i++){
            soma+= m[i]; 
        }
        media = soma/m.length;
        System.out.println("Média: "+media);
        int cont=0;
        
        for(int i=0; i<m.length; i++){
            if(m[i]>media){
                cont+=1;
            }
        }
        return cont;
    }
}

// Dada a série numérica dos números triangulares: 1 3 6 10 15 ... 
// Armazene-a em um array de tamanho igual a quinze

package ado_apii;

public class Exercício1 {
    public static void main(String[] args) {
        System.out.println("=== Exercício 1 ===\n");
        int [] vet = new int[15];
        int soma=1;
        int soma2=2;
        for(int i=0; i<vet.length; i++){
            
            vet[i]= soma;
            
            System.out.println(soma);
            soma = soma +soma2;
            soma2 += 1;
        }   
    }
}

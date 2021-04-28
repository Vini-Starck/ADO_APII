// Escreva um algoritmo que implemente um array de objetos do tipo Produto 
// e tamanho igual a 10. Onde Produto é uma classe que têm os atributos: 
// nome (String), categoria (String), código (int) e preco (float). Na classe principal, 
// simule uma lista de compras de produtos, como saída exiba todos os produtos e soma total dos produtos.

package ado_apii;

import java.util.Scanner;

public class Exercício3 {
    
    private String nome;
    private String categoria;
    private int codigo;
    private float preço;
    
        public static void main (String [] args) {
            System.out.println("=== Exercício 3 ===\n");
            Scanner leitor = new Scanner (System.in);
        
            Exercício3[] m = new Exercício3 [2];
        
        
            for (int i=0; i<m.length; i++) {
                m[i] = new Exercício3();
            
            }
         
            for (int i=0; i<m.length; i++) {
             
                System.out.println("Cadastro de Produto nº "+(i+1)+": ");  
           
                System.out.print("Nome: ");
                m[i].nome = leitor.next();
           
                System.out.print("Categoria: ");
                m[i].categoria = leitor.next() ;
           
                System.out.print("Código: ");
                m[i].codigo = leitor.nextInt() ;
           
                System.out.print("Preço: ");
                m[i].preço = leitor.nextFloat();
           
                System.out.println("\n");  

            }
        
            float preço = 0;
        
            for (int i=0; i<m.length; i++) {
                preço += m[i].preço;
            }
        
            System.out.println("== Exibição ==\n");
        
            for (int i = 0; i < m.length; i++){
                System.out.println("==========\n"
                        + "\nProduto  "+(i+1)+": "
                        + "\nNome       >> "+m[i].nome
                        + "\nCategoria  >> "+m[i].categoria
                        + "\nCódigo     >> "+m[i].codigo
                        + "\nPreço      >> "+m[i].preço
                        + "\n==========\n");  
             
            }
            System.out.println("Valor total da compra -> R$" + preço);
        } 
}


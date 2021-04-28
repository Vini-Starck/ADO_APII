package ado_apii;

public class Ex2 {
    public static void main(String args []){
       String [] a = {"Maçã","Pera","Melancia","banana","abacate","Jaca","morango"};
        
       System.out.println("\n=== Vetor Original ===\n");
        Ex2_metodos.exibir(a);
        Ex2_metodos.bubble(a);
        System.out.println("\n==== Vetor Organizado ===\n");
        Ex2_metodos.exibir(a);
        
        
    }
}

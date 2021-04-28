package ado_apii;

import java.util.Random;

public class OrdenaçãoCaracteres {
    

    public static void inserir(char[]a){
        Random rd = new Random();
        for(int i=0; i<a.length; i++){
            a[i] = (char)(rd.nextInt(25)+97);
            
        }
    }
    
    public static void exibir(char[]a){
        for(int i=0; i<a.length; i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
    
    /**
     * Ordena um array pelo método bolha
     * @param a [] int
     */
    public static void bubble(char[]a){
        char temp;
        for(int j=0; j<a.length-1; j++){         // Varreduras
            for(int i=0; i<a.length-1-j; i++){   // Responsável pelas comparações
                if(a[i] < a[i+1]){
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                }
            }
        }
        
        
    }
}
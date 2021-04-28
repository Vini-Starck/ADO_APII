package ado_apii;

import java.util.Random;

public class OrdenaçãoCaractere {
    
    public static void inserir(int[]a){
        Random rd = new Random();
        for(int i=0; i<a.length; i++){
            a[i] = rd.nextInt(100)+1;
            
        }
    }
    
    public static void exibir(int[]a){
        for(int i=0; i<a.length; i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
    
    /**
     * Ordena um array pelo método bolha
     * @param a [] int
     */
    public static void bubble(int[]a){
        int temp;
        for(int j=0; j<a.length-1; j++){         // Varreduras
            for(int i=0; i<a.length-1-j; i++){   // Responsável pelas comparações
                if(a[i] > a[i+1]){
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                }
            }
        }
        
        
    }
}

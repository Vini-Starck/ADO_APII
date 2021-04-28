/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado_apii;

/**
 *
 * @author starc
 */
public class exercicioCompletamentar1 {
    public static void main(String args[]){
        int []a = {1,3,5,6,8,9};
        int []b = {2,4,7,10,12,15};
        int []c = new int[a.length + b.length];
        
        
        System.out.println("\nArray a: \n");
        junção.exibir(a);
        System.out.println("\nArray b: \n");
        junção.exibir(b);
        System.out.println("\nArray c (junção):\n");
        junção.unir(a, b, c);
        junção.exibir(c);
        
        
        
    }
}

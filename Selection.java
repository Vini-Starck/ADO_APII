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
public class Selection {
    public static void main(String args[]){
        int [] a = {4,16,8,2,1};
        
        
        System.out.println("\n=== Vetor Original ===\n");
        Selection_metodos.exibir(a);
        Selection_metodos.selection(a);
        System.out.println("\n=== Vetor Organizado ===\n");
        Selection_metodos.exibir(a);
        
    }
}

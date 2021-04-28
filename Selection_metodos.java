package ado_apii;


public class Selection_metodos {
    
    /**
     * Ordena um array pelo metodo de seleção.
     * @param a [] int
     */
    public static void selection(int[]a){
        int menor, i, temp;  // Índice
        
        for(int j=0; j<a.length-1; j++){
            menor=j;
            for(i=1+j; i<a.length; i++){   // Responsável pelas comparações
                if(a[menor] > a[i]){
                    menor = i;
                }
            }
            temp=a[menor];
            a[menor]=a[j];
            a[j]=temp;
        }
    }
    
    
    public static void exibir(int[]a){
        for(int i=0; i<a.length; i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
    
}

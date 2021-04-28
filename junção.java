package ado_apii;


public class junção {
    
    /**
     * exibir array junção
     * @param m int[]
     */
    public static void exibir(int []m){
        for(int i=0; i<m.length; i++){
            System.out.println("m["+i+"] = "+m[i]);
        }
    }
    
    
    /**
     * junção de dois arrays
     * @param a int[]
     * @param b int[]
     */
    public static void unir(int[]a, int[]b, int[]c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k] = a[i];
                i++;
                k++;
            }else{
                c[k] = b[j];
                j++;
                k++;
            
            }
        }
        
        while(i<a.length){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k] = b[j];
            j++;
            k++;
        }
        
    }
}
package ado_apii;

public class Ex2_metodos {
    public static void exibir(String[]a){
        for(int i=0; i<a.length; i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
    
    public static void bubble(String[]a){
        String temp;
        for(int j=0; j<a.length-1; j++){
            for(int i=0; i<a.length-1-j; i++){
                /*
                Se as duas Strings forem iguais retorna 0
                Se a primeira for maior q a segunda, retorna positivo
                Se a segunda for maior que a primeira, retorna negativo
                */
                if(a[i].compareTo(a[i+1])>0){
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                }
            }
        }
    }
}

package ado_apii;

public class metodobolha {
    public static void main(String args[]){
        int[]a = new int[10000];
        
        OrdenaçãoCaractere.inserir(a);
        System.out.println("\n=== Vetor Original ===\n");
        OrdenaçãoCaractere.exibir(a);
        long ti = System.currentTimeMillis();
        OrdenaçãoCaractere.bubble(a);
        long tf = System.currentTimeMillis();
        System.out.println("\n=== Vetor Organizado ===\n");
        OrdenaçãoCaractere.exibir(a);
        long intervalo = tf-ti;
        System.out.println("Tempo = "+intervalo);
    }
}

package ado_apii;

public class OrdCaracterMain {
    public static void main(String args[]){
        char[]a = new char[20];
        
        OrdenaçãoCaracteres.inserir(a);
        System.out.println("\n=== Vetor Original ===\n");
        OrdenaçãoCaracteres.exibir(a);
        OrdenaçãoCaracteres.bubble(a);
        System.out.println("\n=== Vetor Organizado ===\n");
        OrdenaçãoCaracteres.exibir(a);
        
    }
}

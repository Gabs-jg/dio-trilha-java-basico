public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("--Processo Seletivo--");
        analisarCandidatos(1900.0);
        analisarCandidatos(2200.0);
        analisarCandidatos(2000.0);
    }

    public static void analisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioPretendido < salarioBase) {
            System.out.println("Ligar para o candidato.");
        } else if(salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }
}
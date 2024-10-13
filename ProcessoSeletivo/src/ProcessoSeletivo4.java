import java.util.Random;

public class ProcessoSeletivo4 {
    public static void main(String[] args) {
        System.out.println("--Processo Seletivo--");
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for(String candidato : candidatos) {
            entrarEmContato(candidato);
        }
    }

    public static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu) {
            System.out.println("Conseguimos contato com o candidato " + candidato + " na " + tentativasRealizadas + "º tentativa.");
        } else {
            System.out.println("Não conseguimos contato com o candidato " + candidato + ". Número máximo de tentativas: " + tentativasRealizadas + " realizadas.");
        }
    }

    public static boolean atender() {
        return new Random().nextInt(3)==1;
    }

}

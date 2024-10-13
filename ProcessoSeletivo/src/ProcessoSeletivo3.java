public class ProcessoSeletivo3 {
    public static void main(String[] args) {
        System.out.println("--Processo Seletivo--");
        imprimirSelecionado();
    }

    public static void imprimirSelecionado() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento.");

        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada (for each): ");

        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }
}

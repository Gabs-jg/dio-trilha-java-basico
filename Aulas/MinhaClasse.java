package Aulas;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Hello world.");

        //Variáveis
        int ano = 2021;
        ano = 2022;

        //Constante:
        final String BR = "Brasil";
        //Não pode atribuir um novo valor.
        //BR = "Brazil";

        String primeiroNome = "Gabriel";
        String segundoNome = "Oliveira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

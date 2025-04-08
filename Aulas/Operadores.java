package Aulas;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;
        System.out.println(- numero);

        numero = - numero;
        System.out.println(numero);

        numero = numero *-1;
        System.out.println(numero);

        numero = numero+2;
        System.out.println(numero);

        numero++; // -> numero = numero + 1;
        System.out.println(numero);

        System.out.println(numero++);
        System.out.println(++numero);

        System.out.println(numero--);
        System.out.println(--numero);

        boolean variavel = true;

        System.out.println(!variavel);
        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);

        int a,b;
        a=5;
        b=6;

        String resultado = " ";
        if(a==b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }

        System.out.println(resultado);

        a=6;
        resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        String nomeUm = "Gabriel";
        String nomeDois = "Gabriel";
        String nomeTres = new String("Gabriel");

        System.out.println(nomeUm==nomeDois);
        System.out.println(nomeUm==nomeTres);
        System.out.println(nomeUm.equals(nomeTres));

        int numero1 = 1;
        int numero2 = 2;

        if(numero1<numero2) {
            System.out.println("Condição verdadeira");
        }

        boolean simNao = numero1==numero2;

        System.out.println("Número 1 é igual a número 2? " + simNao);

        simNao = numero1!=numero2;

        System.out.println("Número 1 é diferente a número 2? " + simNao);

        simNao = numero1>numero2;

        System.out.println("Número 1 é maior a número 2? " + simNao);

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras.");
        }

        if(condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras.");
        }

        if(condicao1 || condicao2) {
            System.out.println("Alguma das condições é verdadeira.");
        }

    }
}

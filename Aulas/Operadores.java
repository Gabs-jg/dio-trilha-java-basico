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
    }
}

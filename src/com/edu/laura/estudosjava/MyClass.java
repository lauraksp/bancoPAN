package com.edu.laura.estudosjava;

public class MyClass {
    public static void main (String [] args) {

        String primeiroNome = "Laura"; // declara as variaveis
        String segundoNome = "Kimberly";

        //declara variavel e chama o metodo passando os parametros
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
}
    //p receber determinado tipo, basta passar a tipagem no início, e os parametros obviamente
    //devem ter a mesma tipagem das variáveis.
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome); //metodo java string concat, valido somente cm str.

    };
}

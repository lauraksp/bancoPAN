public class Operadores {
    public static void main (String[] args) {
         int numero = 5;
         numero = -5;
            System.out.println(numero);
         numero = + numero; //nao imprime +5 pq é operador aritmetico e não unario.
            System.out.println(numero);
         numero = numero * -1; //imprime +5, pois segue a regra matematica.
            System.out.println(numero);

        //System.out.println(numero ++); //so incrementa no prox sysout pq esta apos o metodo de impressao
        //System.out.println(numero);
        System.out.println(++numero); //incrementa imediatamente, deve ser colocado como sufixo
        //Mesma regra p decrementar.

        boolean trocaVF = true;
        System.out.println(!trocaVF); //acrescenta operador de negacao, mas a variavel continua sendo vdd
        //este valor atual é somente na memoria.
        trocaVF = !trocaVF;
        System.out.println(trocaVF); //agr de fato e falsa.

    }
}

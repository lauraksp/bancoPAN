public class Operadores {
    public static void main (String[] args) {
     int numero = 5;
     numero = -5;
        System.out.println(numero);
     numero = + numero; //nao imprime +5 pq é operador aritmetico e não unario.
        System.out.println(numero);
     numero = numero * -1; //imprime +5, pois segue a regra matematica.
        System.out.println(numero);


    }
}

public class OperadorTernario {

    public static void main (String[] args) {
        int a, b;
        a = 5;
        b = 7;
        String resultado = a < b ? "verdadeiro" : "falso";//se e string, o resultado tem q ser string;
        //String resultado = a == b ? "verdadeiro" : "falso";
        //String resultado = a > b ? "verdadeiro" : "falso".

        int resultadoNum = a < b ? 1 : 2;//1 seria vdd e 2 falso.//se e int, o resultado tem q ser int.

        System.out.println(resultado);
        System.out.println(resultadoNum);
    }
}

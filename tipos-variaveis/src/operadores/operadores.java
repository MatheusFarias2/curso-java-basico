package operadores;
public class operadores {
    public static void main(String[] args) {
        int numero = 6;
        boolean variavel = true;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        numero++;

        System.out.println(numero);

        numero--;

        System.out.println(numero);

        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);
    }
}

package operadores;
public class operadores2 {
    public static void main(String []args){
        int a,b;
        a = 5;
        b = 5;
        String resultado = a == b ?"verdadeiro" : "falso";
        System.out.println(resultado);
        b++;
        resultado = a == b ?"verdadeiro" : "falso";
        System.out.println(resultado);


    }
}

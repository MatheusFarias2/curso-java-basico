import java.util.Scanner;
public class CondicaoTernaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        String resultado = nota >= 7 ? "passou" : "reprovou";
        System.out.println(resultado);
    }
}

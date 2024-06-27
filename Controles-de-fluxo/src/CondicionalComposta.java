import java.util.Scanner;
public class CondicionalComposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notamin = 7;
        int nota = scanner.nextInt();
        if(nota >= notamin){
            System.out.println("Parabens voce passou de ano com nota " + nota);
        }
        else{
            System.out.println("Você reprovou!");
        }
    }
}

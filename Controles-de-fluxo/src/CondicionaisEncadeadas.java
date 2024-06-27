import java.util.Scanner;
public class CondicionaisEncadeadas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double nota = scanner.nextDouble();

        if(nota >= 7){
            System.out.println("Voce passou");
        }
        else if(nota < 7 && nota > 4){
            System.out.println("Voce esta de recuperacao");
        }
        else{
            System.out.println("voce foi reprovado");
        }
    }
}

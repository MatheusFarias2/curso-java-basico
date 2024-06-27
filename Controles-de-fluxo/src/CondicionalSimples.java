import java.util.Scanner;
public class CondicionalSimples {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    double saldo = 1500.90;
    double saque = scanner.nextDouble();
    if(saque < saldo){
        saldo = saldo - saque;
        System.out.println("Saque realizado com sucesso. Seu saldo é de: 300" + String.format ("%.3f" ,saldo ));
    }
    else{
        System.out.println("Seu saldo é insuficiente para o saque, por favor tente novamente");
    } 
    }
}

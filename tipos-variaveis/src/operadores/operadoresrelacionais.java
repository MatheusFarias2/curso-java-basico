package operadores;
public class operadoresrelacionais {
public static void main(String []args){
    
    String nomeUm = "Matheus";
    String nomeDois = new String ("Matheus");
    System.out.println(nomeUm.equals(nomeDois));


    int numero1 = 1;
    int numero2 = 2;
 
    boolean simNao = numero1 == numero2;

    if(numero1 < numero2){
        System.out.println("A nossa condição é verdadeira");
    }
    else{
        System.out.println("A nossa condição é falsa");
    }


    System.out.println("numero1 é igual a numero2? " + simNao);

    simNao = numero1 != numero2;
    
    System.out.println("numero1 é diferente de numero2? " + simNao);

    simNao = numero1 > numero2;
    
    System.out.println("numero1 é maior que numero2? " + simNao);
}
    
}
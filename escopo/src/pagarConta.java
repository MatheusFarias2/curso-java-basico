public class pagarConta {
    public static void main(String[] args) throws Exception {
        conta contA = new conta();

        contA.sacar(20);
        System.out.println(contA.novoSaldo);
        System.out.println();
    }
}


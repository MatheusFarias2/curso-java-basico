public class app2 {
    public static void main(String[] args)throws Exception {
        Comandos comandos = new Comandos();

        Comandos.vidas();
        System.out.println("Você tem: ", Comandos.vida , "vidas restantes");

        Comandos.atacar();
        System.out.println("Você atacou -", Comandos.ataque , "de vida do adversário" );
    }
}

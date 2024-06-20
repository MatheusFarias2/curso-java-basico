public class usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        
        smartTv.mudarCanal(9);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume atual? " + smartTv.volume);
        System.out.println("Canal atual? " + smartTv.canal);

        smartTv.ligar();
        System.out.println("teste = TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual? " + smartTv.volume);
        
    }
}

public class conta {
    double saldo = 1500.39;
    double novoSaldo = 1500.39;
    
    public void sacar(double valor){
        novoSaldo = saldo - valor;
    }
    public double calcularDividaExponencial(){
		//variável local de método
		double valorParcela = 50.0;
		double valorMontante = 0.0; // começando a variável com valor zero
		for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
			double valorCalculado = valorParcela * x;
			valorMontante = valorMontante + valorCalculado;
		}
    }
}



public class Main {

	public static void main(String[] args) {
		Cliente ErenGabriel = new Cliente();
		ErenGabriel.setNome("Eren Gabriel");
		
		Conta cc = new ContaCorrente(ErenGabriel);
		Conta poupanca = new ContaPoupanca(ErenGabriel);

		cc.depositar(5000);
		cc.transferir(750, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
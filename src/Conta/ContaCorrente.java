package Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
	}

	@Override
	public double getImpostoSaque() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}

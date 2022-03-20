package Conta;

public class ContaPoupanca extends Conta {

	private static final double IMPOSTO_POUPANCA = 1;
	
	public ContaPoupanca(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
	}

	@Override
	public double getImpostoSaque() {
		// TODO Auto-generated method stub
		return 0;
	}

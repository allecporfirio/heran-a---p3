package Conta;

public abstract class Conta {

	private int agencia;
	private int conta;
	private double saldo;
	private String titular;

	public Conta(int agencia, int conta, String titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;

	}

	public void Conta1(int agencia, int conta, String titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}

	public Conta(int agencia, int conta, double saldo, String titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.titular = titular;
	}


	public final void sacar(double montante) {
		
	}
	

	public abstract double getImpostoSaque();

	public void depositar(double montante) {
		
		if(montante > 0) {
			saldo += montante;
		} 
	}

	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getConta() {
		return conta;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	

}
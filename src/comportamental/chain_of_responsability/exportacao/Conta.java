package comportamental.chain_of_responsability.exportacao;

public class Conta {

	private String titular;
	private double saldo;

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}
	
}

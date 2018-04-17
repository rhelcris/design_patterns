package comportamental.padrao_strategy.investimento;

public class Investidor {

	private TipoDoInvestidor tipoInvestidor;
	private double saldo;

	public Investidor(TipoDoInvestidor tipoInvestidor, double saldo) {
		this.tipoInvestidor = tipoInvestidor;
		this.saldo = saldo;		
	}
	
	public void deposita(double lucro) {
		this.saldo += lucro;
	}

	public double getSaldo() {
		return saldo;
	}

	public TipoDoInvestidor getTipoInvestidor() {
		return tipoInvestidor;
	}
	
}

package comportamental.padrao_strategy.investimento;

public class Conservador implements Investimento {
	
	public static final double RENTABILIDADE = 0.008;
	
	@Override
	public double calcula(Investidor investidor) {
		return investidor.getSaldo() * RENTABILIDADE;
	}

}

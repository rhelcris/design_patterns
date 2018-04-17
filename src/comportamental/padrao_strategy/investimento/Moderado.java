package comportamental.padrao_strategy.investimento;

import java.util.Random;

public class Moderado implements Investimento {
	
	public static final double RENTABILIDADE_MINIMA = 0.007;
	public static final double RENTABILIDADE_MAXIMA = 0.025;

	@Override
	public double calcula(Investidor investidor) {
		boolean escolhido = new Random().nextDouble() < 0.5;
		
		if( escolhido ) {
			return investidor.getSaldo() * RENTABILIDADE_MAXIMA;			
		} else {
			return investidor.getSaldo() * RENTABILIDADE_MINIMA;
		}
	}

}

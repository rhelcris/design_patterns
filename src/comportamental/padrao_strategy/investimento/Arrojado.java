package comportamental.padrao_strategy.investimento;

import java.util.Random;

public class Arrojado implements Investimento {

	public static final double RENTABILIDADE_MINIMA = 0.006;
	public static final double RENTABILIDADE_MEDIA  = 0.03;
	public static final double RENTABILIDADE_MAXIMA = 0.05;
	
	@Override
	public double calcula(Investidor investidor ) {
		double chance = new Random().nextDouble();;
		
		if( chance <= 0.2 )
			return investidor.getSaldo() * RENTABILIDADE_MAXIMA;
		else if (chance <= 0.3 )
			return investidor.getSaldo() * RENTABILIDADE_MEDIA;
		else 
			return investidor.getSaldo() * RENTABILIDADE_MINIMA;
	}

}

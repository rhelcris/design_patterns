package comportamental.padrao_strategy.investimento;

public class TesteDeInvestimento {

	public static void main(String[] args) {
		Investidor joao = new Investidor(TipoDoInvestidor.CONSERVADOR, 3500.0);
		Investimento investimento;
		
		if(joao.getTipoInvestidor() == TipoDoInvestidor.CONSERVADOR) {
			investimento = new Conservador();
		} else if ( joao.getTipoInvestidor() == TipoDoInvestidor.MODERADO ) {
			investimento = new Moderado(); 
		} else {
			investimento = new Arrojado();
		}
		
		RealizadorDeInvestimento realizadorDeInvestimento = new RealizadorDeInvestimento();
		realizadorDeInvestimento.investir(joao, investimento );
		
	}
	
}

package comportamental.padrao_strategy.investimento;

public class RealizadorDeInvestimento {

	public void investir(Investidor investidor, Investimento investimento) {

		double resultado = investimento.calcula(investidor);

		System.out.println("O saldo atual do investidor é: " + investidor.getSaldo());
		investidor.deposita(resultado * 0.75);
		System.out.println("O saldo atualizado do investidor é:" + investidor.getSaldo());
	}
}

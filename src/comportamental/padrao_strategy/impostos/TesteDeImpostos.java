package comportamental.padrao_strategy.impostos;

public class TesteDeImpostos {

	public static void main(String[] args) {
		
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		
		// calculando o ICMS
		calculadorDeImpostos.realizarCalculo(orcamento, icms);
		calculadorDeImpostos.realizarCalculo(orcamento, iss);
		
	}
	
}

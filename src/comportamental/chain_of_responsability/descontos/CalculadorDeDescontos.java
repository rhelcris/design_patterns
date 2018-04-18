package comportamental.chain_of_responsability.descontos;

public class CalculadorDeDescontos {

	public double calcular(Orcamento orcamento) {
		DescontoPorVendaCasada d1 = new DescontoPorVendaCasada();
		DescontoDeDezPorcentoParaMaisDeCincoItens d2 = new DescontoDeDezPorcentoParaMaisDeCincoItens();
		DescontoParaMaisDeQuinhentosReais d3 = new DescontoParaMaisDeQuinhentosReais();
		SemDesconto d4 = new SemDesconto();
		
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
		
		return d1.calcula(orcamento);
	}
	
}

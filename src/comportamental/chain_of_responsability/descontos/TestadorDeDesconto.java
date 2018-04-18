package comportamental.chain_of_responsability.descontos;

public class TestadorDeDesconto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionar(new Item("Lapis", 250.0));
		orcamento.adicionar(new Item("Caneta", 250.0));
		orcamento.adicionar(new Item("Borracha", 250.0));
		orcamento.adicionar(new Item("Apagador", 250.0));
		orcamento.adicionar(new Item("Giz de cera", 250.0));
		orcamento.adicionar(new Item("Canetinha", 250.0));
		
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		double desconto = calculador.calcular(orcamento);
		System.out.println(desconto);
	}
	
}

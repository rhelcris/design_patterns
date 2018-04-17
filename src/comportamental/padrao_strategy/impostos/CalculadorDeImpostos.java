package comportamental.padrao_strategy.impostos;

public class CalculadorDeImpostos {

	public void realizarCalculo(Orcamento orcamento, Imposto imposto) {
		
		double valor = imposto.calcula(orcamento);
		System.out.println(valor);

	}

}

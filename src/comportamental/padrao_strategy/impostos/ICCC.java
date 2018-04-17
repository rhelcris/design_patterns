package comportamental.padrao_strategy.impostos;

public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if( orcamento.getValor() < 1000)
			return orcamento.getValor() * 0.05;
		else if( orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000 )
			return orcamento.getValor() * 0.07;
		else
			return orcamento.getValor() * 0.08 + 30;
	}
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(1500.0);

		Imposto novoImposto = new ICCC();		
		
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		
		calculadorDeImpostos.realizarCalculo(orcamento, novoImposto);
	}
}


package comportamental.chain_of_responsability.descontos;

public class SemDesconto implements Desconto {

	@Override
	public double calcula(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		
	}

}

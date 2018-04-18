package comportamental.chain_of_responsability;

public class DescontoDeDezPorcentoParaMaisDeCincoItens implements Desconto {

	private Desconto desconto;

	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		} else {
			return desconto.calcula(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.desconto = desconto;
	}

}

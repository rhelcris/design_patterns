package comportamental.chain_of_responsability.descontos;

public class DescontoParaMaisDeQuinhentosReais implements Desconto {

	private Desconto desconto;

	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		} else {
			return desconto.calcula(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.desconto = desconto;
	}

}

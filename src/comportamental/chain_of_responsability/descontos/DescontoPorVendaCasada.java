package comportamental.chain_of_responsability.descontos;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto desconto;
	
	private static final String PRODUTO1 = "Caneta";
	private static final String PRODUTO2 = "Lapis";

	@Override
	public double calcula(Orcamento orcamento) {
		if( existeItensDeVendaCasada(orcamento)) {
			return orcamento.getValor() * 0.1;
		} else {
			return desconto.calcula(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.desconto = desconto;
	}

	private boolean existeItensDeVendaCasada(Orcamento orcamento) {
		if( existeItem(PRODUTO1, orcamento) && existeItem(PRODUTO2, orcamento)) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean existeItem(String produto, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if( item.getProduto().equals(produto)) {
				return true;
			}
		}
		return false;
	}
}

package comportamental.chain_of_responsability.descontos;

public class Item {

	private String produto;
	private double valor;

	public Item(String produto, double valor) {
		this.produto = produto;
		this.valor = valor;
	}

	public String getProduto() {
		return produto;
	}

	public double getValor() {
		return valor;
	}
	
}

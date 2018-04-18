package comportamental.chain_of_responsability.descontos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private double valor;
	private List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void adicionar(Item item) {
		this.itens.add(item);
	}
	
}

package comportamental.chain_of_responsability.descontos;

public interface Desconto {

	double calcula(Orcamento orcamento);
	void setProximo(Desconto desconto);
	
}

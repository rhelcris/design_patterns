package comportamental.chain_of_responsability;

public interface Desconto {

	double calcula(Orcamento orcamento);
	void setProximo(Desconto desconto);
	
}

package comportamental.chain_of_responsability.exportacao;

public interface Resposta {

	void responde(Requisicao req, Conta conta);
	void setProxima(Resposta resposta);
	
}

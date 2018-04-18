package comportamental.chain_of_responsability.exportacao;

public class SemResposta implements Resposta {

	@Override
	public void responde(Requisicao req, Conta conta) {

	}

	@Override
	public void setProxima(Resposta resposta) {
		
	}

}

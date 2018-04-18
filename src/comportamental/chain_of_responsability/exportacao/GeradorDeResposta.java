package comportamental.chain_of_responsability.exportacao;

public class GeradorDeResposta {

	public void responder(Requisicao requisicao, Conta conta) {

		Resposta resposta1 = new RespostaEmXml();
		Resposta resposta2 = new RespostaEmCsv();
		Resposta resposta3 = new RespostaEmPorcento();
		Resposta resposta4 = new SemResposta();

		resposta1.setProxima(resposta2);
		resposta2.setProxima(resposta3);
		resposta3.setProxima(resposta4);
		
		resposta1.responde(requisicao, conta);
		
	}

}

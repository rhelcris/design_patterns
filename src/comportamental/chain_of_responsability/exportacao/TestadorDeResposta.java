package comportamental.chain_of_responsability.exportacao;

public class TestadorDeResposta {

	public static void main(String[] args) {
		Conta conta = new Conta("Rhelcris Salvino de Sousa", 4500.0);
		
		Requisicao requisicao = new Requisicao(Formato.XML);
		
		GeradorDeResposta gerador = new GeradorDeResposta();
		gerador.responder(requisicao, conta);
	}
}

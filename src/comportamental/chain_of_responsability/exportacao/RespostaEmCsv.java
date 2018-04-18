package comportamental.chain_of_responsability.exportacao;

public class RespostaEmCsv implements Resposta {

	private Resposta resposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular()+","+conta.getSaldo());
		} else {
			resposta.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}

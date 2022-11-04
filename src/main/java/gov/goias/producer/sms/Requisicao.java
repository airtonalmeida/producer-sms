package gov.goias.producer.sms;

import lombok.Data;

@Data
public class Requisicao {	
	
	/*
	 * public Requisicao(String numero, String mensagem) { this.numero = numero;
	 * this.mensagem = mensagem; }
	 */
	private String numero;

	private String mensagem;
	
	private String idCliente;

}

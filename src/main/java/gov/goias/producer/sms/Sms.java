package gov.goias.producer.sms;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Sms {	

	private String usuario;
	
	private String senha;
	
	private Set<Requisicao> requisicao =  new HashSet<>();

	/*
	 * public Sms(String usuario, String senha, Set<Requisicao> requisicao) {
	 * super(); this.usuario = usuario; this.senha = senha; this.requisicao =
	 * requisicao; }
	 * 
	 * public Sms() { super(); }
	 */

}

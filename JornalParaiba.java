package oBSERVERR;

import java.util.ArrayList;

public class JornalParaiba implements Jornal {
	private String nome = "Jornal Paraiba";
	ArrayList<Cliente> assinante = new ArrayList<Cliente>();

	@Override
	public void notifica(String texto) {
		for (Cliente c : this.assinante) {
			c.addNotificao(texto, new DTOJornal(this));
		}

	}

	@Override
	public String nomeJornal() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	@Override
	public void assinante(Cliente cliente) {
		assinante.add(cliente);

	}

}

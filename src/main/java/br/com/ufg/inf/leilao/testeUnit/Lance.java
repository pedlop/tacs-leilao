package br.com.ufg.inf.leilao.testeUnit;

import br.com.ufg.inf.leilao.testeUnit.Usuario;;

public class Lance {

	private Usuario usuario;
	private double valor;
	
	public Lance(Usuario usuario, double valor) {
		this.usuario = usuario;
		this.valor = valor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public double getValor() {
		return valor;
	}
	
	
	
}

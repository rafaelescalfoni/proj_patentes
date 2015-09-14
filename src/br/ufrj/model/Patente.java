package br.ufrj.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Patente implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String numPedido;
	private String titulo;
	private String resumo;
	private String classificacao;
	private String dataDeposito;
	private String nomeInventor;
	private String nomeDepositante;
	private String outros;

	public Patente() {
	}

	public Patente(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(String numPedido) {
		this.numPedido = numPedido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getDataDeposito() {
		return dataDeposito;
	}

	public void setDataDeposito(String dataDeposito) {
		this.dataDeposito = dataDeposito;
	}

	public String getNomeInventor() {
		return nomeInventor;
	}

	public void setNomeInventor(String nomeInventor) {
		this.nomeInventor = nomeInventor;
	}

	public String getNomeDepositante() {
		return nomeDepositante;
	}

	public void setNomeDepositante(String nomeDepositante) {
		this.nomeDepositante = nomeDepositante;
	}

	public String getOutros() {
		return outros;
	}

	public void setOutros(String outros) {
		this.outros = outros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patente other = (Patente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patente [id=" + id + ", numPedido=" + numPedido + ", titulo=" + titulo + ", classificacao="
				+ classificacao + ", dataDeposito=" + dataDeposito + ", nomeInventor=" + nomeInventor
				+ ", nomeDepositante=" + nomeDepositante + "]";
	}
	
	
}

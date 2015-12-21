package br.com.biblioteca.Model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Livro implements Serializable{

	@Id
	@GeneratedValue
	long id;
	@Column
	String nome;
	@Column
	String escritor;
	@Column
	int anoEdicao;
	@Column
	int  classificação;
	public Livro(long id, String nome, String escritor, int anoEdicao, int classificação) {
		super();
		this.id = id;
		this.nome = nome;
		this.escritor = escritor;
		this.anoEdicao = anoEdicao;
		this.classificação = classificação;
	}
	public Livro() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEscritor() {
		return escritor;
	}
	public void setEscritor(String escritor) {
		this.escritor = escritor;
	}
	public int getAnoEdicao() {
		return anoEdicao;
	}
	public void setAnoEdicao(int anoEdicao) {
		this.anoEdicao = anoEdicao;
	}
	public int getClassificação() {
		return classificação;
	}
	public void setClassificação(int classificação) {
		this.classificação = classificação;
	}
	
	

}

package br.com.biblioteca.Model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Emprestimo implements Serializable{
	
	@Id
	@GeneratedValue
	long id;
	@Column
	Date dataEmprestimo;
	@Column
	long idPessoa;
	@Column
	long  idLivro;
	@Column
	Calendar dataHoraDevolucao;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public long getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(long idPessoa) {
		this.idPessoa = idPessoa;
	}
	public long getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(long idLivro) {
		this.idLivro = idLivro;
	}
	public Calendar getDataHoraDevolucao() {
		return dataHoraDevolucao;
	}
	public void setDataHoraDevolucao(Calendar dataHoraDevolucao) {
		this.dataHoraDevolucao = dataHoraDevolucao;
	}
	public Emprestimo(long id, Date dataEmprestimo, long idPessoa, long idLivro, Calendar dataHoraDevolucao) {
		super();
		this.id = id;
		this.dataEmprestimo = dataEmprestimo;
		this.idPessoa = idPessoa;
		this.idLivro = idLivro;
		this.dataHoraDevolucao = dataHoraDevolucao;
	}

}

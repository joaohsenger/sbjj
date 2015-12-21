package br.com.biblioteca.controller;

import br.com.biblioteca.Dao.LivroDao;
import br.com.biblioteca.Dao.LivroDaoImp;
import br.com.biblioteca.Model.Livro;

import java.util.List;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

public class LivroController {
	
	private Livro livro;
	private DataModel listaLivros;
	
	public DataModel getListarLivros(){
		List <Livro> lista = new LivroDaoImp().list();
		listaLivros = new ListDataModel(lista);
		return listaLivros;
		
	}
	public Livro getLivro() {
		return livro;
		}
		public void setLivro(Livro livro) {
		this.livro = livro;
		}
		public String prepararAdicionarLivro(){
		livro = new Livro();
		return "gerenciarLivro";
		}
		public String prepararAlterarLivro(){
		livro = (Livro)(listaLivros.getRowData());
		return "gerenciarLivro";
		}
		public String excluirLivro(){
		Livro livroTemp = (Livro)(listaLivros.getRowData());
		LivroDao dao = new LivroDaoImp();
		dao.remove(livroTemp);
		return "index";
		}
		public String adicionarLivro(){
		LivroDao dao = new LivroDaoImp();
		dao.save(livro);
		return "index";
		}
		public String alterarLivro(){
		LivroDao dao = new LivroDaoImp();
		dao.update(livro);
		return "index";
		}

}

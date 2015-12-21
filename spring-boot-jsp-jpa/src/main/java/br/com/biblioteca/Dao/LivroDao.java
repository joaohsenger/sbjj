package br.com.biblioteca.Dao;

import java.util.List;

import br.com.biblioteca.Model.Livro;

public interface LivroDao {
	
	public void save(Livro livro);
	public Livro getLivro (Long id);
	public List<Livro>list();
	public void remove(Livro livro);
	public void update (Livro livro);
}

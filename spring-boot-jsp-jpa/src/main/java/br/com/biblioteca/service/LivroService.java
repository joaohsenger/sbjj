package br.com.biblioteca.service;

import java.util.List;

import br.com.biblioteca.Model.Livro;

public interface LivroService {
	

	Livro findById(long id);
	
	Livro findByName(String name);
	
	void saveLivro(Livro livro);
	
	void updateLivro(Livro livro);
	
	void deleteLivroById(long id);

	List<Livro> findAllLivros(); 
	
	void deleteAllLivros();
	
	public boolean isLivroExist(Livro livro);
	

}

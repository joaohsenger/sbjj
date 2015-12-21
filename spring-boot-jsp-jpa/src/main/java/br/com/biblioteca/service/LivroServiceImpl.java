package br.com.biblioteca.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


import br.com.biblioteca.Model.Livro;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("livroService")
@Transactional
public class LivroServiceImpl implements LivroService {

	private static final AtomicLong counter = new AtomicLong();
	private static List<Livro> livros;
	static{
		livros = populateDummyLivros();
	}
	@Override
	public Livro findById(long id) {
		for (Livro livro:livros){
			if (livro.getId() ==  id){
				return livro;
			}
		}
		return null;
	}
	@Override
	public Livro findByName(String name) {
		for (Livro livro:livros){
			if (livro.getNome().equalsIgnoreCase(name)){
				return livro;
			}
		}
		return null;
	}
	@Override
	public void saveLivro(Livro livro) {
		livro.setId(counter.incrementAndGet());
		livros.add(livro);
		
	}
	@Override
	public void updateLivro(Livro livro) {
		int index = livros.indexOf(livro);
		livros.set(index, livro);
		
	}
	@Override
	public void deleteLivroById(long id) {
		for (Iterator<Livro> iterator = livros.iterator(); iterator.hasNext(); ) {
		    Livro livro = iterator.next();
		    if (livro.getId() == id) {
		        iterator.remove();
		    }
		}
		
	}
	@Override
	public List<Livro> findAllLivros() {
		return livros;
	}
	@Override
	public void deleteAllLivros() {
		livros.clear();
		
	}
	@Override
	public boolean isLivroExist(Livro livro) {
		return findByName(livro.getNome())!=null;
	}
	
	private static List<Livro> populateDummyLivros(){
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(new Livro(counter.incrementAndGet(),"Marinha", "jose", 15, 2010));
		livros.add(new Livro(counter.incrementAndGet(),"Tijuca", "juca", 10, 2015));
		livros.add(new Livro(counter.incrementAndGet(),"Almirante", "silva", 18, 2000));
		livros.add(new Livro(counter.incrementAndGet(),"Cuervo","martinho",  12, 1998));
		return livros;
	}
	
}

package br.com.biblioteca.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import br.com.biblioteca.Model.Livro;

@Repository
public class LivroDaoImp implements LivroDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void save(Livro livro) {
		hibernateTemplate.save(livro);
		
	}

	@Override
	public Livro getLivro(Long id) {
		return hibernateTemplate.get(Livro.class, id);
	}

	@Override
	public List<Livro> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Livro livro) {
		hibernateTemplate.delete(livro);
		
	}

	@Override
	public void update(Livro livro) {
		hibernateTemplate.update(livro);
		
	}

}

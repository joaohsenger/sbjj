package br.com.biblioteca.Test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import br.com.biblioteca.Dao.LivroDaoImp;
import br.com.biblioteca.Model.Livro;

@RunWith(SpringJUnit4ClassRunner.class)

//@ContextConfiguration(locations={“classpath:springconfiguration.xml”})

//@TransactionConfiguration(transactionManager=”transactionManager”,defaultRollback=true)

@Transactional
public class LivroDaoImpTest {

	@Autowired

	private Livro livro;
	private LivroDaoImp livroDaoImp;
	
	@Before
	public void setUp() throws Exception{
		
		livro =  new Livro();
		livro.setNome("A revolta");
		livro.setAnoEdicao(2015);
		livro.setClassificação(14);;
		livro.setEscritor("juca");
		
	}
	@Test
	public void testSave(){
		try {
			
			livroDaoImp.save(livro);
		} catch (Exception e) {
			fail("not expected result");
		}
		
	}
	
}

package io.github.deyvidsantos.crud.service;

import java.util.Arrays;

import io.github.deyvidsantos.crud.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.deyvidsantos.crud.domain.Livro;
import io.github.deyvidsantos.crud.repository.CategoriaRepository;
import io.github.deyvidsantos.crud.repository.LivroRepository;

@Service
public class DBService {
	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informática", "Livros de T.I");
		Categoria cat2 = new Categoria(null, "Ficção Cientifica", "Ficção envolvendo Ciência");
		Categoria cat3 = new Categoria(null, "Biografia", "Biografia sobre algum famoso, filosofo e etc.");
		
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem Ipsum", cat1);
		Livro l2 = new Livro(null, "Engenharia de Software", "Louis V. Gertner", "Lorem Ipsum", cat1);
		Livro l3 = new Livro(null, "The Time Machine", "H.G Wells", "Lorem Ipsum", cat2);
		Livro l4 = new Livro(null, "The War of Worlds", "H.G Wells", "Lorem Ipsum", cat2);
		Livro l5 = new Livro(null, "I, Robot", "Isaac Asimov", "Lorem Ipsum", cat2);
		Livro l6 = new Livro(null, "Isaac Newton", "Isaac Newton", "Biografia do Newton", cat3);
		
		cat1.getLivros().addAll(Arrays.asList(l1,l2));
		cat2.getLivros().addAll(Arrays.asList(l3,l4,l5));
		cat3.getLivros().addAll(Arrays.asList(l6));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5, l6));
	}
}

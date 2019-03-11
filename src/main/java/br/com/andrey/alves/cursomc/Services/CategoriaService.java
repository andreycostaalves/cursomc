package br.com.andrey.alves.cursomc.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andrey.alves.cursomc.Repositories.CategoriaRepository;
import br.com.andrey.alves.cursomc.domain.Categoria;

@Service
public class CategoriaService {

	@Autowired // serve para instanciar a dependencia pelo springo
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
	}
	
}

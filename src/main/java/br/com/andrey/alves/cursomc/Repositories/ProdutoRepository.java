package br.com.andrey.alves.cursomc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.andrey.alves.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Integer> {

}

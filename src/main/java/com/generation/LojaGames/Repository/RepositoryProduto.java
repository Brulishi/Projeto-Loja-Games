package com.generation.LojaGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProduto extends JpaRepository<Produtos, Long>{

	/**
	 * Metodo utilizado para retornar pesquisa pela coluna descricaoTitulo
	 * 
	 * @param descricaoTitulo
	 * @return Lista com todos as descriçoes que contenham a palavra digitada
	 * @author Gustavo
	 * @since 1.0
	 */
	public List<Produtos> findAllByDescricaoTituloContainingIgnoreCase(String descricaoTitulo);
}

package br.iesp.edu.api.repository;

import br.iesp.edu.api.entity.Favoritos;
import br.iesp.edu.api.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoritosRepository extends JpaRepository<Favoritos, Integer> {

    List<Favoritos> findAllByPessoaId(int id);
}

package br.iesp.edu.api.repository;

import br.iesp.edu.api.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    List<Pessoa> findByNome(String nome);
}

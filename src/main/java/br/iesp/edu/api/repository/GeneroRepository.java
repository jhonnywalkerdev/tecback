package br.iesp.edu.api.repository;

import br.iesp.edu.api.entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer>{
    List<Genero> findByNome (String nome);
}


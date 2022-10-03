package br.iesp.edu.api.repository;

import br.iesp.edu.api.entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerieRepository
        extends JpaRepository<Serie, Integer> {

}

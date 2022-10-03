package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.Genero;
import br.iesp.edu.api.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {

    @Autowired    // Injeção de dependencia
    private GeneroRepository repository;

    public Genero salvar(Genero genero){
        genero = repository.save(genero);
        return genero;
    }

    public Genero atualizar(Genero genero){
        if(genero.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        genero = repository.save(genero);
        return genero;
    }

    public void excluir(Genero genero){
        if(genero.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        repository.delete(genero);
    }
    public void excluirPorID(Integer id){
        repository.deleteById(id);
    }

    public List<Genero> listar(){
        return repository.findAll();
    }
}

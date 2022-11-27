package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.Favoritos;
import br.iesp.edu.api.repository.FavoritosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritosService {

    @Autowired
    private FavoritosRepository repository;

    public Favoritos salvar(Favoritos favorito){
        favorito = repository.save(favorito);
        return favorito;
    }

    public void excluir(Favoritos favorito){
        if(favorito.getId() == null){
            throw new RuntimeException("Id nulo");
        }
        repository.delete(favorito);
    }

    public void excluirPorId(Integer id){
        repository.deleteById(id);
    }

    public List<Favoritos> favoritosByPessoaId(Long pessoaId){
        return repository.findByPessoaId(pessoaId);
    }
}

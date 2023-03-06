package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.Favoritos;
import br.iesp.edu.api.entity.Filme;
import br.iesp.edu.api.entity.Pessoa;
import br.iesp.edu.api.entity.Serie;
import br.iesp.edu.api.repository.FavoritosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritosService {


    @Autowired
    private FavoritosRepository repository;
    @Autowired
    private PessoaService pService;
    @Autowired
    private FilmeService fService;
    @Autowired
    private SerieService sService;

    public Favoritos salvar(int idPessoa, int idPrograma){
        Pessoa p = pService.listarPorId(idPessoa);
        Filme f = fService.listarPorId(idPrograma);
        Serie s = sService.listarPorId(idPrograma);
        Favoritos favorito = new Favoritos();
        favorito.setPessoa(p);
        favorito.setFilme(f);
        favorito.setSerie(s);
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

    public List<Favoritos> listarPorPessoaId(int id){
        return repository.findAllByPessoaId(id);
    }

}

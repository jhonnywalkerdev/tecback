package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Favoritos;
import br.iesp.edu.api.service.FavoritosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa/favorito")
public class FavoritosResource {

    @Autowired
    private FavoritosService service;


    @PostMapping
    public Favoritos salvar( int idPessoa, int idPrograma ){
        return service.salvar(idPessoa, idPrograma);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable int id){
        service.excluirPorId(id);
    }

    @GetMapping
    public List<Favoritos> listarPorPessoaId(int id){return service.listarPorPessoaId(id);}

}

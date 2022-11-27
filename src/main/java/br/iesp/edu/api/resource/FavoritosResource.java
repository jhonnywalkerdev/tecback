package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Favoritos;
import br.iesp.edu.api.entity.Filme;
import br.iesp.edu.api.entity.Pessoa;
import br.iesp.edu.api.entity.Serie;
import br.iesp.edu.api.service.FavoritosService;
import br.iesp.edu.api.service.FilmeService;
import br.iesp.edu.api.service.PessoaService;
import br.iesp.edu.api.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa/favorito")
public class FavoritosResource {

    @Autowired
    private FavoritosService service;
    private PessoaService pService;
    private FilmeService fService;
    private SerieService sService;

    @PostMapping
    public Favoritos salvar(@RequestBody int idPessoa, int idPrograma ){
        Pessoa p = pService.listarPorId(idPessoa);
        Filme f = fService.listarPorId(idPrograma);
        Serie s = sService.listarPorId(idPrograma);
        Favoritos favorito = new Favoritos();
        favorito.setPessoaId(p);
        favorito.setFilmeId(f);
        favorito.setSerieId(s);
        return service.salvar(favorito);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable int id){
        service.excluirPorId(id);
    }

    @GetMapping("/{pessoaId}")
    public List<Favoritos> listarFavoritos(@PathVariable Long pessoaId){
        return service.favoritosByPessoaId(pessoaId);
    }

}

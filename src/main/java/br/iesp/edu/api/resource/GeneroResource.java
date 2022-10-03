package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Genero;
import br.iesp.edu.api.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController    //Para reconhecer como recurso Rest.
@RequestMapping("/genero")     //Para mapear o caminho URL

public class GeneroResource {
    private final GeneroService generoService;

    @Autowired // Injeção de dependencia
    public GeneroResource(GeneroService generoService) {
        this.generoService = generoService;
    }
    @GetMapping //Para responder a requisição do HTTP.
    public List<Genero> getUsers() {
        return (List<Genero>) generoService.listar();
    }

    @PostMapping // Para salvar
    void addUser(@RequestBody Genero genero) {
        generoService.salvar(genero);
    }

}



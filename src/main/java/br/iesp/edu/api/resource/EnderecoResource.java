package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Endereco;
import br.iesp.edu.api.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class EnderecoResource {

    @Autowired
    EnderecoService service;

    @GetMapping
    public Endereco listarPorCep(String cep){
        return service.buscaEnderecoCep(cep);
    }

}

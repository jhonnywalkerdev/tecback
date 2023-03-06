package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.Endereco;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnderecoService {

    public Endereco buscaEnderecoCep(String cep){
        RestTemplate template = new RestTemplate();
        return template.getForObject("https://viacep.com.br/ws/{cep}/json",Endereco.class, cep);
    }
}

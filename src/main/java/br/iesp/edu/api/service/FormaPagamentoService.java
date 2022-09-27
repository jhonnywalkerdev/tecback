package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.FormaPagamento;
import br.iesp.edu.api.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagamentoService {

    @Autowired
    private FormaPagamentoRepository repository;

    public FormaPagamento salvar(FormaPagamento formaPagamento){
        return repository.save(formaPagamento);
    }

    public FormaPagamento atualizar(FormaPagamento formaPagamento) throws Exception{
        if(formaPagamento.getId() == null){
            throw new Exception("ID não encontrado");
        }
        return repository.save(formaPagamento);
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

    public List<FormaPagamento> listar(){
        return repository.findAll();
    }


}

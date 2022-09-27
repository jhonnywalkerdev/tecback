package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.FormaPagamento;
import br.iesp.edu.api.service.FormaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formapag")
public class FormaPagamentoResource {

    private final FormaPagamentoService formaPagamentoService;

    @Autowired
    public FormaPagamentoResource(FormaPagamentoService formaPagamentoService){this.formaPagamentoService = formaPagamentoService;}

    @GetMapping
    public List<FormaPagamento> getFormaPag(){return(List<FormaPagamento>) formaPagamentoService.listar();}

    @PostMapping
    void addFormaPag(@RequestBody FormaPagamento formaPagamento){formaPagamentoService.salvar(formaPagamento);}
}

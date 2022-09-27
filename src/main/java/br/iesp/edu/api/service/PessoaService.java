package br.iesp.edu.api.service;


import br.iesp.edu.api.entity.Pessoa;
import br.iesp.edu.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public static String byteArrayToHexString(String pass) { // encrypt func
        byte[] passBytes = pass.getBytes();
        String newPass = "";
        for (int i = 0; i < passBytes.length; i++) {
            newPass += Integer.toString((passBytes[i] & 0xff) + 0x100, 16).substring(1);
        }
        return newPass;
    }

    public Pessoa salvar(Pessoa pessoa){
        pessoa.setSenha(byteArrayToHexString(pessoa.getSenha())); // encrypt
        return repository.save(pessoa);
    }

    public Pessoa atualizar(Pessoa pessoa) throws Exception {
        if(pessoa.getId()==null){
            throw new Exception("ID não encontrado");
        }
        return repository.save(pessoa);
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

    public List<Pessoa> listar(){
        return repository.findAll();
    }

    public List<Pessoa> listarPorNome(String nome){
        return repository.findByNome(nome);
    }




}

package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Entity
public class Pessoa {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String email;

    private String senha;

    @ManyToOne
    private FormaPagamento formaPagamento;
}

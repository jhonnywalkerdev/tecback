package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class FormaPagamento {

    @Id
    @GeneratedValue
    private Integer id;

    private String nCartao;

    private String ccv;

    private LocalDate validade;

    private String nomeTitular;

    private String documento;
}

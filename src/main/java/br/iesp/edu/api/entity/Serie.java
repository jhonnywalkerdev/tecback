package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;

@Entity
@Getter
@Setter
public class Serie {

    @Id
    @GeneratedValue
    private Integer id;
    private String titulo;
    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;
    private int ano;
    private int duracao;
    private int relevancia;
    private String sinopse;
    private String trailer;

}

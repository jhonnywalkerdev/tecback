package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Favoritos {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Pessoa pessoaId;

    @ManyToOne
    private Filme filmeId;

    @ManyToOne
    private Serie serieId;
}

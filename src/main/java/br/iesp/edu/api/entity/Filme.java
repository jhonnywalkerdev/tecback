package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;

@Entity
@Getter
@Setter
public class Filme {

    @Id
    @GeneratedValue
    private Integer id;
    private String titulo;

    @ManyToOne
    private Genero genero;

    private int ano;


}

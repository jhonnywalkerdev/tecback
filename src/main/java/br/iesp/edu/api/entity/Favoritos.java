package br.iesp.edu.api.entity;

import com.sun.istack.Nullable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Null;

@Getter
@Setter
@Entity
public class Favoritos {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Pessoa pessoa;

    @Nullable
    @ManyToOne
    private Filme filme;

    @Nullable
    @ManyToOne
    private Serie serie;
}

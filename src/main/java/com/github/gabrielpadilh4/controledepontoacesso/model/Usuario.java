package com.github.gabrielpadilh4.controledepontoacesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    private long id;
    private String nome;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal toleranciaAtraso;
    private LocalDateTime inicioJornada;
    private LocalDateTime fimJornada;
}

package com.cadtextil.main.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name="tb_estoque")
@Data
public class Estoque implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String produto;
    private String cor;
    private String tamanho;
    private String deposito;
    private Instant dataDisponibilidade;
    private int quantidade;
}

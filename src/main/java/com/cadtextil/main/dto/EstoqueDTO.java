package com.cadtextil.main.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.Instant;
@Data
public class EstoqueDTO {

    private Long id;
    private String produto;
    private String cor;
    private String tamanho;
    private String deposito;
    @JsonProperty(value = "data_disponibilidade")
    private Instant dataDisponibilidade;
    private int quantidade;
}

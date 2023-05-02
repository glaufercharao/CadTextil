package com.cadtextil.main.resources;

import com.cadtextil.main.dto.EstoqueDTO;
import com.cadtextil.main.services.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estoque")
public class EstoqueResource {

    @Autowired
    private EstoqueService service;

    @PostMapping
    public ResponseEntity<EstoqueDTO> salvar(@RequestBody EstoqueDTO estoque){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(estoque));
    }
    @PutMapping
    public ResponseEntity<EstoqueDTO> atualizar(@RequestBody EstoqueDTO estoque){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.atualizar(estoque));
    }
    @GetMapping
    public ResponseEntity<Page<EstoqueDTO>> listarTodos(Pageable pageable){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.listarTodos(pageable));
    }
}

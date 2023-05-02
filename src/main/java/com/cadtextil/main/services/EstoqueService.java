package com.cadtextil.main.services;

import com.cadtextil.main.dto.EstoqueDTO;
import com.cadtextil.main.entities.Estoque;
import com.cadtextil.main.mapper.Mappable;
import com.cadtextil.main.repositories.EstoqueRepository;
import com.cadtextil.main.services.exception.DatabaseException;
import com.cadtextil.main.services.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EstoqueService  implements Mappable{

    @Autowired
    private EstoqueRepository repository;

    @Transactional
    public EstoqueDTO salvar(EstoqueDTO estoque){
        try {
            return map(repository.save(map(estoque, Estoque.class)), EstoqueDTO.class);
        }catch (DataIntegrityViolationException e){
           throw new DatabaseException("Produto deve ser único, já está cadastrado.");
        }

    }

    @Transactional
    public EstoqueDTO atualizar(EstoqueDTO estoque){
        Optional<Estoque> estoqueResultado = repository
                .findById(estoque.getId());
        if (!estoqueResultado.isPresent()) {
            throw new ResourceNotFoundException("ID não encontrado.");
        }
        return map(repository.save(map(estoque, Estoque.class)), EstoqueDTO.class);
    }

    public Page<EstoqueDTO> listarTodos(Pageable pageable) {
        return map(repository.findAll(pageable), EstoqueDTO.class);
    }
}

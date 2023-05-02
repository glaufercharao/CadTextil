package com.cadtextil.main.repositories;

import com.cadtextil.main.entities.Estoque;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
    Page<Estoque> findAll(Pageable pageable);
}

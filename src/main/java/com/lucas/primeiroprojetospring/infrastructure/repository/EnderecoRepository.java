package com.lucas.primeiroprojetospring.infrastructure.repository;

import com.lucas.primeiroprojetospring.infrastructure.Entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}

package com.lucas.primeiroprojetospring.infrastructure.repository;

import com.lucas.primeiroprojetospring.infrastructure.Entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

}

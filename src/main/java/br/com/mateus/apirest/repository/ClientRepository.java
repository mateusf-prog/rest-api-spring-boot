package br.com.mateus.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mateus.apirest.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}

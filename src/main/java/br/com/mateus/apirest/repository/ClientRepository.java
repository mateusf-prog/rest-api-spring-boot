package br.com.mateus.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mateus.apirest.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    
}

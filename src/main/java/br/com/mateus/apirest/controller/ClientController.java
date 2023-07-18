package br.com.mateus.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.mateus.apirest.model.Client;
import br.com.mateus.apirest.repository.ClientRepository;

@RestController
@RequestMapping("/")
public class ClientController {
    
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> listAll() {
        return clientRepository.findAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client obj) {
        return clientRepository.save(obj);
    }
}


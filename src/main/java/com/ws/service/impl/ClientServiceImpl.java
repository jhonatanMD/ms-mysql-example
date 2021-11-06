package com.ws.service.impl;

import com.ws.entity.ClientEntity;
import com.ws.repository.ClientRepository;
import com.ws.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository repository;

    @Override
    public List<ClientEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public ClientEntity save(ClientEntity clientEntity) {
        return repository.save(clientEntity);
    }
}

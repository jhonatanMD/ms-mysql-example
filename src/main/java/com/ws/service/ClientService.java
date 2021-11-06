package com.ws.service;

import com.ws.entity.ClientEntity;

import java.util.List;

public interface ClientService {


    List<ClientEntity> findAll();
    ClientEntity save(ClientEntity clientEntity);


}

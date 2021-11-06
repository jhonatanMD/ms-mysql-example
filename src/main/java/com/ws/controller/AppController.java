package com.ws.controller;

import com.ws.entity.ClientEntity;
import com.ws.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ws")
public class AppController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/client/findAll")
    public List<ClientEntity> findAll(){
        return clientService.findAll();
    }

    @PostMapping("/client/save")
    public ClientEntity save(@RequestBody ClientEntity clientEntity){
        return clientService.save(clientEntity);
    }





}

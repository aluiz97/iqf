package com.projeto.firstone.service;

import com.projeto.firstone.repository.SquadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SquadService {

    @Autowired
    private SquadRepository squadRepository;

}

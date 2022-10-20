package com.projeto.firstone.controller;

import com.projeto.firstone.service.SquadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/squads")
public class SquadController {

    @Autowired
    private SquadService squadService;
}

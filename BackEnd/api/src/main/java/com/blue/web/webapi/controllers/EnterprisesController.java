package com.blue.web.webapi.controllers;


import com.blue.web.application.domain.entity.Enterprise;
import com.blue.web.services.EnterprisesService;
import com.blue.web.services.VoteService;
import com.blue.web.webapi.dtos.EnterpriseDTO;
import com.blue.web.webapi.dtos.RegisterVoteDTO;
import com.blue.web.webapi.dtos.StandardAnswerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enterprises")
public class EnterprisesController {

    private final EnterprisesService enterprisesService;

    public EnterprisesController(EnterprisesService enterprisesService) {
        this.enterprisesService = enterprisesService;
    }

    @GetMapping(value = "/list")
    public List<Enterprise> listEnterprises() {

        return enterprisesService.listEnterprises();
    }

    @PostMapping(value = "/create")
    public StandardAnswerDTO createEnterprise(@RequestBody EnterpriseDTO enterpriseDTO) {

        if (enterpriseDTO.getName() == null)
            throw new RuntimeException("Name should not be null!");
        if (enterpriseDTO.getImage() == null)
            throw new RuntimeException("Image should not be null!");

        enterprisesService.createEnterprise(enterpriseDTO);

        return new StandardAnswerDTO(true, "Enterprise Created!");
    }
}

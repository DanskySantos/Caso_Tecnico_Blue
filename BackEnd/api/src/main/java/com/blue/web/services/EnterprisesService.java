package com.blue.web.services;

import com.blue.web.application.domain.entity.Enterprise;
import com.blue.web.application.domain.entity.Vote;
import com.blue.web.infrastructure.repositories.EnterpriseRepository;
import com.blue.web.infrastructure.repositories.VoteRepository;
import com.blue.web.webapi.dtos.EnterpriseDTO;
import com.blue.web.webapi.dtos.RegisterVoteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterprisesService {

    private final EnterpriseRepository enterpriseRepository;

    public EnterprisesService(EnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }

    public List<Enterprise> listEnterprises() {
        return enterpriseRepository.findAll();
    }

    public void createEnterprise(EnterpriseDTO enterpriseDTO) {
        Enterprise enterprise = new Enterprise();

        enterprise.setName(enterpriseDTO.getName());
        enterprise.setImage(enterpriseDTO.getImage());

        enterpriseRepository.save(enterprise);
    }

}

package com.blue.web.services;

import com.blue.web.application.domain.entity.User;
import com.blue.web.application.domain.entity.Vote;
import com.blue.web.infrastructure.repositories.UserRepository;
import com.blue.web.infrastructure.repositories.VoteRepository;
import com.blue.web.webapi.dtos.RegisterVoteDTO;
import org.springframework.stereotype.Service;

@Service
public class VoteService {

    private final VoteRepository voteRepository;

    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public void registerVote(RegisterVoteDTO registerVoteDTO) {
        Vote vote = new Vote();

        vote.setUser(registerVoteDTO.getUser());
        vote.setEnterprise(registerVoteDTO.getEnterprise());

        voteRepository.save(vote);
    }
}

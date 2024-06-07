package com.example.Unimpact.Services;

import com.example.Unimpact.Models.ContribuinteExterno;
import com.example.Unimpact.Repositories.ContribuinteExternoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ContribuinteExternoService {

    final ContribuinteExternoRepository repos;

    public ContribuinteExternoService(ContribuinteExternoRepository repos) {
        this.repos = repos;
    }

    @Transactional
    public ContribuinteExterno save(ContribuinteExterno contribuinteExterno){
        return repos.save(contribuinteExterno);
    }
}

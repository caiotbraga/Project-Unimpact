package com.example.Unimpact.Repositories;

import com.example.Unimpact.Models.ContribuinteExterno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContribuinteExternoRepository extends JpaRepository<ContribuinteExterno, Long> {
}

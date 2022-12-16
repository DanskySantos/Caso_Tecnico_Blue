package com.blue.web.infrastructure.repositories;

import com.blue.web.application.domain.entity.Enterprise;
import com.blue.web.application.domain.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {
}

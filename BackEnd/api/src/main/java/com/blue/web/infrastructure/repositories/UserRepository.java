package com.blue.web.infrastructure.repositories;

import com.blue.web.application.domain.entity.User;
import com.blue.web.application.domain.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

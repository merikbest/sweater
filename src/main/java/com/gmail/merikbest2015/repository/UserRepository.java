package com.gmail.merikbest2015.repository;

import com.gmail.merikbest2015.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

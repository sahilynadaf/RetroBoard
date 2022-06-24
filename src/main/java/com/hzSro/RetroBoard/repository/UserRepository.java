package com.hzSro.RetroBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hzSro.RetroBoard.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

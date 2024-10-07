package com.ls.jwt_login.auth.repository;

import com.ls.jwt_login.models.IUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<IUser, Integer> {
    Optional<IUser> findByUsername(String username);
}

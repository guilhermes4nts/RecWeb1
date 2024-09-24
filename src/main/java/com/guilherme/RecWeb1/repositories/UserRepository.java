package com.guilherme.RecWeb1.repositories;

import com.guilherme.RecWeb1.entities.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    List<UserModel> findByNomeContaining(String nome);
}

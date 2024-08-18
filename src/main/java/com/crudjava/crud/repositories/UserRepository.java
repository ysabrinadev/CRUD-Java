package com.crudjava.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudjava.crud.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

}

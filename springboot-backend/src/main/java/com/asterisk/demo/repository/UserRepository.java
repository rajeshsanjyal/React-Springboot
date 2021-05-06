package com.asterisk.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asterisk.demo.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

package com.example.Online_Management_System_1.Repository;


import com.example.Online_Management_System_1.Entity.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Userinforepository extends JpaRepository<Userinfo, Integer> {
    Optional<Userinfo> findByName(String username);
}

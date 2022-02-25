package com.userService.user.repository;

import com.userService.user.model.userDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<userDetails,Integer> {


 //   Optional<String> findByUsername(String userName);
}

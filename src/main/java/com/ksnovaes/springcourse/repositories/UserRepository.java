package com.ksnovaes.springcourse.repositories;

import com.ksnovaes.springcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

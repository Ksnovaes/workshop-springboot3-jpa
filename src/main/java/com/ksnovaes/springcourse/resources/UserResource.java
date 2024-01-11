package com.ksnovaes.springcourse.resources;

import com.ksnovaes.springcourse.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Kauã", "kaka@gmail.com", "999999999", "0000000");
        return ResponseEntity.ok().body(u);
    }
}

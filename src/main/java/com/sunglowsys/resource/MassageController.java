package com.sunglowsys.resource;


import com.sunglowsys.domain.User;
import com.sunglowsys.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MassageController {

//    private final KafkaProducer kafkaProducer;
//
//    public MassageController(KafkaProducer kafkaProducer) {
//        this.kafkaProducer = kafkaProducer;
//    }
//
//    @PostMapping("/messages")
//    public void sendMessage(@RequestBody String message) {
//        kafkaProducer.sendMessage(message);
//    }

    private final UserService userService;
    public MassageController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user ) {
        User result = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
    @PutMapping("/users")
    public ResponseEntity<User> updateUser(@RequestBody User user ) {
        User result = userService.updateUser(user);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }


    @GetMapping("/users")
    public ResponseEntity<List<User>> findAllUser() {
        List<User> result = userService.findAllUser();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }


    @GetMapping("/user/{id}")
    public ResponseEntity<User> findOneUser(@PathVariable Long id) {
        User result = userService.findOneUser(id);
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }


    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> deleteUser( @PathVariable Long id) {
       userService.delete(id);
       return ResponseEntity.status(HttpStatus.OK).build();
    }



}

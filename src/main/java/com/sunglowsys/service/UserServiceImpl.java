package com.sunglowsys.service;


import com.sunglowsys.domain.User;
import com.sunglowsys.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {


    private final KafkaTemplate<String , User> kafkaTemplate;
    private final String topic = "my-topic";

     private final  UserRepository userRepository;
     @Autowired
    public UserServiceImpl(KafkaTemplate<String, User> kafkaTemplate, UserRepository userRepository) {
         this.kafkaTemplate = kafkaTemplate;
         this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
         log.info("crete userservice : {}" , user);
         kafkaTemplate.send("my-topic", user.getName(),user);
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        log.info("update userservice : {}" , user);
        return userRepository.save(user);
    }

    @Override
    public List<User> findAllUser() {

        log.info("findAll User userservice : {}");
        return userRepository.findAll();
    }

    @Override
    public User findOneUser(Long id) {
        log.info("find One user userservice : {}" , id);
        return userRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        log.info("delete  userservice : {}" , id);
         userRepository.deleteById(id);

    }
}

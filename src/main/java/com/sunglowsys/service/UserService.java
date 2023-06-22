package com.sunglowsys.service;


import com.sunglowsys.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);
    User updateUser(User user);
    List<User> findAllUser();
    User findOneUser(Long id);
    void delete(Long id);
}

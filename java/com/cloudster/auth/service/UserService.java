package com.cloudster.auth.service;

import com.cloudster.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}

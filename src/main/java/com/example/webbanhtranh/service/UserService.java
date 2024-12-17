package com.example.webbanhtranh.service;

import com.example.webbanhtranh.dto.UserDto;
import com.example.webbanhtranh.model.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}

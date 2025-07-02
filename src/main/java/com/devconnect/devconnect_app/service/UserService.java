package com.devconnect.devconnect_app.service;

import com.devconnect.devconnect_app.dto.input.CreateUserInput;
import com.devconnect.devconnect_app.dto.input.UpdateUserInput;
import com.devconnect.devconnect_app.dto.output.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO getUser(Integer id);
    UserDTO createUser(CreateUserInput createUserInput);
    UserDTO updateUser(UpdateUserInput updateUserInput);
    Boolean deleteUser(Integer id);
    Boolean followUser(Integer followerId, Integer followingId);
    Boolean unfollowUser(Integer followerId, Integer followingId);
}

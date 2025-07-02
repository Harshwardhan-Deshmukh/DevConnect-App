package com.devconnect.devconnect_app.service.impl;

import com.devconnect.devconnect_app.dto.input.CreateUserInput;
import com.devconnect.devconnect_app.dto.input.UpdateUserInput;
import com.devconnect.devconnect_app.dto.output.UserDTO;
import com.devconnect.devconnect_app.entity.UserEntity;
import com.devconnect.devconnect_app.exception.ResourceNotFoundException;
import com.devconnect.devconnect_app.repository.UserRepository;
import com.devconnect.devconnect_app.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserEntity> users = userRepository.findAll();
        return users.stream().map(
                userEntity -> modelMapper.map(userEntity, UserDTO.class)
        ).toList();
    }

    @Override
    public UserDTO getUser(Integer id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("User with id " + id + " not found"));
        return modelMapper.map(userEntity, UserDTO.class);
    }

    @Override
    public UserDTO createUser(CreateUserInput createUserInput) {
        UserEntity userEntity = modelMapper.map(createUserInput, UserEntity.class);
        UserEntity savedEntity = userRepository.save(userEntity);
        return modelMapper.map(savedEntity, UserDTO.class);
    }

    @Override
    public UserDTO updateUser(UpdateUserInput updateUserInput) {
        UserEntity userEntity = userRepository.findById(updateUserInput.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User with id " + updateUserInput.getId() + " not found"));

        modelMapper.typeMap(UpdateUserInput.class, UserEntity.class)
                .addMappings(mapper -> {
                    mapper.map(UpdateUserInput::getName, UserEntity::setName);
                    mapper.map(UpdateUserInput::getEmail, UserEntity::setEmail);
                    mapper.map(UpdateUserInput::getBio, UserEntity::setBio);
                });

        modelMapper.map(updateUserInput, userEntity);
        UserEntity updatedUser = userRepository.save(userEntity);
        return modelMapper.map(updatedUser, UserDTO.class);
    }

    @Override
    public Boolean deleteUser(Integer id) {
        UserEntity user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User with ID " + id + " not found"));

        userRepository.delete(user);
        return true;
    }

    @Override
    public Boolean followUser(Integer followerId, Integer followingId) {
        if (followerId.equals(followingId)) {
            throw new RuntimeException("You cannot follow yourself");
        }

        UserEntity follower = userRepository.findById(followerId)
                .orElseThrow(() -> new ResourceNotFoundException("User with ID " + followerId + " not found"));

        UserEntity following = userRepository.findById(followingId)
                .orElseThrow(() -> new ResourceNotFoundException("User with ID " + followingId + " not found"));

        if (follower.getFollowing().contains(following)) {
            throw new RuntimeException("You already follow this user");
        }

        follower.getFollowing().add(following);
        userRepository.save(follower);

        return true;
    }

    @Override
    public Boolean unfollowUser(Integer followerId, Integer followingId) {
        UserEntity follower = userRepository.findById(followerId)
                .orElseThrow(() -> new ResourceNotFoundException("User with ID " + followerId + " not found"));

        UserEntity following = userRepository.findById(followingId)
                .orElseThrow(() -> new ResourceNotFoundException("User with ID " + followingId + " not found"));

        if (!follower.getFollowing().contains(following)) {
            throw new RuntimeException("You are not following this user");
        }

        follower.getFollowing().remove(following);
        userRepository.save(follower);
        return true;
    }
}

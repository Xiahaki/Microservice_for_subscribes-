package org.example.service;

import lombok.AllArgsConstructor;
import org.example.dao.UserRepository;
import org.example.dto.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getUser(Integer userId) {
        return userRepository.getReferenceById(userId);
    }

    public void deleteUser(Integer userId) {
        userRepository.deleteAllById(List.of(userId));
    }
}

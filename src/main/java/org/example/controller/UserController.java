package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/users")
    public String createUser(@RequestBody User user) {
        user.setId(null);
        userService.saveUser(user);
        return "Пользователь зарегистрирован: " + user.toString();
    }

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable int id) {
        return userService.getUser(id).toString();
    }

    @PutMapping("/users/{id}")
    public String putUser(@RequestBody User user, @PathVariable int id) {
        user.setId(id);
        userService.saveUser(user);
        return "Информация успешно обновлена";
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "Пользователь удален";
    }
}

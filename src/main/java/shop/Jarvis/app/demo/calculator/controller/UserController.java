package shop.Jarvis.app.demo.calculator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.Jarvis.app.demo.calculator.entity.User;
import shop.Jarvis.app.demo.calculator.service.UserService;
import shop.Jarvis.app.demo.calculator.service.UserServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController @RequiredArgsConstructor @RequestMapping("/users")
public class UserController {
    private final UserServiceImpl userService;

    @GetMapping("/all")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/name/{name}")
    public List<User> findAllByName(String name) {
        return userService.findAllByName(name);
    }

    @GetMapping("/name/{id}")
    public Optional<User> findById(long id) {
        return userService.findById(id);
    }
}

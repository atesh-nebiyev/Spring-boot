package az.developia.springboot.controller;
import az.developia.springboot.model.User;
import az.developia.springboot.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public User getUser(
            @PathVariable("id") long id
    ){
        return this.userService.getUserById(id);
    }
}

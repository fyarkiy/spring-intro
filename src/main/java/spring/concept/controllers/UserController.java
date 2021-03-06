package spring.concept.controllers;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.concept.dto.UserResponseDto;
import spring.concept.model.User;
import spring.concept.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/inject")
    public String injectUsers() {
        userService.add(new User("Andy", "a@gmail.com", "1234", "Andy R"));
        userService.add(new User("Mandy", "m@gmail.com", "asdf1234", "Mandy B"));
        userService.add(new User("Gareth", "ga@gmail.com", "wert4321", "Gareth J"));
        userService.add(new User("Gwyn", "gw@gmail.com", "98oiuy", "Gwyn As"));
        return "Users were injected.";
    }

    @GetMapping("/{id}")
    public UserResponseDto getUser(@PathVariable Long id) {
        return mapUserToDto(userService.getById(id));
    }

    @GetMapping()
    public List<UserResponseDto> getAll() {
        return userService.listUsers().stream()
                .map(this::mapUserToDto)
                .collect(Collectors.toList());
    }

    private UserResponseDto mapUserToDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setName(user.getName());
        userResponseDto.setEmail(user.getEmail());
        return userResponseDto;
    }
}

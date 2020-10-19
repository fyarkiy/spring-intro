package spring.concept;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.concept.config.AppConfig;
import spring.concept.model.User;
import spring.concept.service.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User first = new User("first", "f@gmail.com", "1234", "first");
        User second = new User("second", "s@gmail.com", "1234", "second");
        User third = new User("third", "t@gmail.com", "1234", "third");
        userService.add(first);
        userService.add(second);
        userService.add(third);
        userService.listUsers().forEach(System.out::println);
    }
}

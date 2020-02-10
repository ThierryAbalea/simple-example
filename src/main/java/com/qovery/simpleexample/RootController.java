package com.qovery.simpleexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by evoxmusic on 02/12/2019.
 */
@RestController
@RequestMapping("/")
public class RootController {

    private static int logCount = 0;

    @GetMapping
    public List<User> listAll() {
        System.out.println("*** listAll executed: " + logCount++);
        return Arrays.asList(
                new User("Alice", "Smith", 31),
                new User("John", "Dom", 24),
                new User("Jack", "Bauer", 54),
                new User("Thierry", "Abaléa", 42)
        );
    }

}

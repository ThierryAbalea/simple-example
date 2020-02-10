package com.qovery.simpleexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by evoxmusic on 02/12/2019.
 */
@RestController
@RequestMapping("/")
public class RootController {

    private Logger logger = LoggerFactory.getLogger(RootController.class);

    private AtomicInteger logCount = new AtomicInteger();

    @GetMapping
    public List<User> listAll() {
        logger.info("QOVERY_BRANCH_NAME: " + System.getenv("QOVERY_BRANCH_NAME"));
        logger.info("MY_ENV_VAR1: " + System.getenv("MY_ENV_VAR1"));
        logger.info("*** listAll executed : " + logCount.getAndIncrement());
        return Arrays.asList(
                new User("Alice", "Smith", 31),
                new User("John", "Dom", 24),
                new User("Jack", "Bauer", 54),
                new User("Thierry", "Abaléa", 42)
        );
    }

}

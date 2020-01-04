package com.hendisantika.springbootsingletonpattern;

import com.hendisantika.springbootsingletonpattern.model.LoggingSingleton;
import com.hendisantika.springbootsingletonpattern.util.LogLevel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSingletonPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSingletonPatternApplication.class, args);
        // logging singleton test.
        LoggingSingleton instance = LoggingSingleton.getInstance();
        instance.logSomething("This is my message.", LogLevel.WARN);
    }

}

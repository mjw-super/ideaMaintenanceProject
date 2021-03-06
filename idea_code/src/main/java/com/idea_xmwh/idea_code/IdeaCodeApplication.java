package com.idea_xmwh.idea_code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
@ServletComponentScan
public class IdeaCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdeaCodeApplication.class, args);
    }

}

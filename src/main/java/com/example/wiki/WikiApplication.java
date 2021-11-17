package com.example.wiki;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@Slf4j
public class WikiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(WikiApplication.class, args);
        Environment env = app.getEnvironment();
        log.info("啟動成功");
        log.info("地址: \thttp://127.0.0.1:{}",env.getProperty("server.port"));
    }

}

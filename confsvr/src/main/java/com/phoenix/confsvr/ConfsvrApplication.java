package com.phoenix.confsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication // 스프링 클라우드 컨피그서버는 스프링부트 애플리케이션이기 때문
@EnableConfigServer // 스프링 클라우드 컨피그 서비스로 사용가능하게 한다
public class ConfsvrApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfsvrApplication.class, args);
    }

}

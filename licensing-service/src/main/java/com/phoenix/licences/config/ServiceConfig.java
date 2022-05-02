package com.phoenix.licences.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {
    @Value("${example.property}") // 스프링 클라우드 컨피그 서버의 값을 읽어옴
    String exampleProperty;
    public String getExampleProperty(){
        return exampleProperty;
    }
}

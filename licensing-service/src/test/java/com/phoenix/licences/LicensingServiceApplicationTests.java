package com.phoenix.licences;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LicensingServiceApplicationTests {

    @Value("${example.property}")
    String fromGithubProperty;

    @Test
    void contextLoads() {
        System.out.println(fromGithubProperty); // I AM IN THE DEFAULT FROM GITHUB
    }

}

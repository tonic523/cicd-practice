package com.practice.cicd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {

    private final String secret;

    public Properties(@Value("${secret}") String secret) {
        this.secret = secret;
    }
}

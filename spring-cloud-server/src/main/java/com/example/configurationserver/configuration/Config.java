package com.example.configurationserver.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class Config {
    @Value("${my.property.test}")
    private String testProperty;
}

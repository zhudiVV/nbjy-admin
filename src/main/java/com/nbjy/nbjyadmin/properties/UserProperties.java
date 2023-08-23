package com.nbjy.nbjyadmin.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user")
@Data
public class UserProperties {
    private Integer id;
    private String name;
    private Boolean sex;
    private Integer age;
}

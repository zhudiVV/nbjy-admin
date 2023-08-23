package com.nbjy.nbjyadmin.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "admin")
@Data
public class AdminProperties {
    private Integer id;
    private String username;
    private String password;
}

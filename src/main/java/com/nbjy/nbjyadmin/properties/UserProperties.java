package com.nbjy.nbjyadmin.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ConfigurationProperties(prefix = "user")
@Data
public class UserProperties {
    private Integer id;
    private Integer sex;
    private Boolean isPaused;
    private Date birthday;
}

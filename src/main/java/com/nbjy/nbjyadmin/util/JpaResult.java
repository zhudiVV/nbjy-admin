package com.nbjy.nbjyadmin.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JpaResult {
    private Integer code;
    private String message;
    private List<T> data;
}

package com.nbjy.nbjyadmin.util;

import com.nbjy.nbjyadmin.dto.AdminDto;
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
    private List data;

    public JpaResult(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
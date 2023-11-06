package com.nbjy.nbjyadmin.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MyPageUtil {
    private long totalPage;
    private long totalNum;
    private List list;

    public MyPageUtil(long totalPage, long totalNum, List list) {
        this.totalPage = totalPage;
        this.totalNum = totalNum;
        this.list = list;
    }
}

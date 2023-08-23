package com.nbjy.nbjyadmin.controller;

import com.nbjy.nbjyadmin.util.Result;
import com.nbjy.nbjyadmin.util.ResultGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin/")
public class AdminController {
    @PostMapping(value = "login")
    @ResponseBody
    public Result adminLogin(@RequestParam("username") String username,
                             @RequestParam("password") String password) {
        return ResultGenerator.genSuccessResult();
    }
}

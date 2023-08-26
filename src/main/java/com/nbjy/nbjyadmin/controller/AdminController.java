package com.nbjy.nbjyadmin.controller;

import com.nbjy.nbjyadmin.dto.AdminDto;
import com.nbjy.nbjyadmin.service.AdminService;
import com.nbjy.nbjyadmin.util.JpaResult;
import com.nbjy.nbjyadmin.util.Result;
import com.nbjy.nbjyadmin.util.ResultGenerator;
import lombok.val;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("admin/")
public class AdminController {
    @Resource
    private AdminService adminService;
    @PostMapping(value = "login")
    @ResponseBody
    public Result adminLogin(@RequestParam("username") String username,
                             @RequestParam("password") String password) {
        System.out.println("--------------");
        System.out.println(username);
        System.out.println(password);
        JpaResult o = adminService.getByUserNameAndPassword(username, password);
        System.out.println(o.toString());

        if(o.getCode() != 0) {
            return ResultGenerator.genErrorResult(o.getCode(), o.getMessage());
        } else {
            return ResultGenerator.genSuccessResult(o.getData());
        }
    }
}

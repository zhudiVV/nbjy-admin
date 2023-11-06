package com.nbjy.nbjyadmin.controller.users;

import com.nbjy.nbjyadmin.dto.UsersDto;
import com.nbjy.nbjyadmin.service.UsersService;
import com.nbjy.nbjyadmin.util.CommonResult;
import com.nbjy.nbjyadmin.util.MyPageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("users/")
public class NbjyUserController {
   @Autowired
   private UsersService usersService;

    @GetMapping(value = "list")
    @ResponseBody
    public CommonResult<MyPageUtil> usersList(@RequestParam(value = "num", required = false, defaultValue = "0") int num, @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize) {
        Pageable page = PageRequest.of(num, pageSize);

        Page<UsersDto> userList = usersService.getUsersAll(page);
        MyPageUtil myPageUtil = new MyPageUtil(userList.getTotalPages(), userList.getTotalElements(), userList.getContent());
        return CommonResult.success(myPageUtil);
    }
}

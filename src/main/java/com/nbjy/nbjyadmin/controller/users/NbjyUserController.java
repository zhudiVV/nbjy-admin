package com.nbjy.nbjyadmin.controller.users;

import com.nbjy.nbjyadmin.dto.UsersDto;
import com.nbjy.nbjyadmin.repository.UsersRepository;
import com.nbjy.nbjyadmin.util.Result;
import com.nbjy.nbjyadmin.util.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("users/")
public class NbjyUserController {
   @Autowired
   private UsersRepository usersRepository;

    @GetMapping(value = "list")
    @ResponseBody
    public Result usersList() {
//        return usersRepository.findAll();
        return ResultGenerator.genSuccessResult(usersRepository.findAll());
    }
}

package com.nbjy.nbjyadmin.service;

import com.nbjy.nbjyadmin.dto.AdminDto;
import com.nbjy.nbjyadmin.repository.AdminRepository;
import com.nbjy.nbjyadmin.util.JpaResult;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {
    @Resource
    private AdminRepository adminRepository;

    @Transactional
    public JpaResult getByUserNameAndPassword(String userName, String password) {
        if(!adminRepository.findByUsername(userName).isEmpty()) {
            List<AdminDto> o = adminRepository.findByUsernameAndPassword(userName, password);
            if(!o.isEmpty()) {
                return new JpaResult(0, "success", o);
            } else {
                // 密码错误
                return new JpaResult(-2, "密码错误");
            }
        } else {
            // 用户名错误
            return new JpaResult(-1, "用户名错误");
        }
    }

}

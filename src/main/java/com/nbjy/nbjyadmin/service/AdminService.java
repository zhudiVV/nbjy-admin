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
    public List<JpaResult> getByUserNameAndPassword(String userName, String password) {
        if(adminRepository.findByUsername(userName).size() > 0) {
            List<AdminDto> o = adminRepository.findByUsernameAndPassword(userName, password);
            if(o.size() > 0) {
                return (T) o;
            } else {
                // 密码错误
                return (T) Integer.valueOf(-2);
            }
        } else {
            // 用户名错误
            return new JpaResult(-1, "用户名错误", );
        }
    }

}

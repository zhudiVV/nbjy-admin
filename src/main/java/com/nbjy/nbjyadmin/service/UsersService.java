package com.nbjy.nbjyadmin.service;

import com.nbjy.nbjyadmin.dto.UsersDto;
import com.nbjy.nbjyadmin.repository.UsersRepository;
import com.nbjy.nbjyadmin.util.JpaResult;

import com.nbjy.nbjyadmin.util.ResultGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Data
@AllArgsConstructor
public class UsersService {
    @Resource
    private UsersRepository usersRepository;

    public Page<UsersDto> getUsersAll(Pageable page) {
        return usersRepository.findAll(page);
    }
}

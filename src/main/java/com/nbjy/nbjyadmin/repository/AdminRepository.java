package com.nbjy.nbjyadmin.repository;

import com.nbjy.nbjyadmin.dto.AdminDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepository extends JpaRepository<AdminDto, Integer> {
    List<AdminDto> findByUsernameAndPassword(String username, String password);

    List<AdminDto> findByUsername(String username);

    List<AdminDto> findByPassword(String password);
}

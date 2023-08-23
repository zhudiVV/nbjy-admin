package com.nbjy.nbjyadmin.repository;

import com.nbjy.nbjyadmin.dto.AdminDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminDto, Integer> {
//    List<AdminDto> find
}

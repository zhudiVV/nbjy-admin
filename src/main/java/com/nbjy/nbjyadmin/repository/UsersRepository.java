package com.nbjy.nbjyadmin.repository;

import com.nbjy.nbjyadmin.dto.UsersDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<UsersDto, Integer> {
}

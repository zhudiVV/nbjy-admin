package com.nbjy.nbjyadmin.repository;

import com.nbjy.nbjyadmin.dto.UsersDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UsersRepository extends PagingAndSortingRepository<UsersDto, Long> {
    Page<UsersDto> findAll(Pageable pageable);
}

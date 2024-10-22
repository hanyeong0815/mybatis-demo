package com.example.demo.mybatis.common;

import com.example.demo.mybatis.domain.Member;

public interface DefaultMapper {
    void insert(Member member);
    Member findById(Long id);
    Member findByUsername(String username);
    String now();
}

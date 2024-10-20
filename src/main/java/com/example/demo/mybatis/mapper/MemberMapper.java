package com.example.demo.mybatis.mapper;

import com.example.demo.mybatis.domain.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    void insert(Member member);
    Member findById(Long id);
    Member findByUsername(String username);
}

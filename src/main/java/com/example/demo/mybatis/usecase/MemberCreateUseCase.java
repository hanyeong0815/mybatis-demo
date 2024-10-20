package com.example.demo.mybatis.usecase;

import com.example.demo.mybatis.domain.Member;
import com.example.demo.mybatis.dto.MemberRequestDto.MemberCreateRequestDto;

public interface MemberCreateUseCase {
    Member createMember(MemberCreateRequestDto dto);
}

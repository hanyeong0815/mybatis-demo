package com.example.demo.mybatis.service;

import com.example.demo.mybatis.domain.Member;
import com.example.demo.mybatis.dto.MemberRequestDto.MemberCreateRequestDto;
import com.example.demo.mybatis.mapper.MemberMapper;
import com.example.demo.mybatis.usecase.MemberCreateUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements MemberCreateUseCase {
    private final MemberMapper membermapper;

    @Override
    public Member createMember(MemberCreateRequestDto dto) {
        Member member = Member.builder()
                .username(dto.username())
                .password(dto.password())
                .build();

        membermapper.insert(member);

        return membermapper.findByUsername(dto.username());
    }
}

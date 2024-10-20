package com.example.demo.mybatis.controller;

import com.example.demo.mybatis.domain.Member;
import com.example.demo.mybatis.dto.MemberRequestDto.MemberCreateRequestDto;
import com.example.demo.mybatis.usecase.MemberCreateUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/member")
@RequiredArgsConstructor
public class MemberApi {
    private final MemberCreateUseCase memberCreateUseCase;

    @PostMapping("")
    public Member createMember(@RequestBody MemberCreateRequestDto dto) {
        return memberCreateUseCase.createMember(dto);
    }
}

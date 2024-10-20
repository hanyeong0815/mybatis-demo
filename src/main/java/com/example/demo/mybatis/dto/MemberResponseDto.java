package com.example.demo.mybatis.dto;

import lombok.Builder;

public record MemberResponseDto() {
    @Builder
    public record MemberCreateResponseDto(
            Long id,
            String username,
            String createdAt
    ) {}
}

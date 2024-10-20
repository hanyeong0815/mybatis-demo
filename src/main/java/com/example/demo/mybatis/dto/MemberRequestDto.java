package com.example.demo.mybatis.dto;

public record MemberRequestDto() {
    public record MemberCreateRequestDto(String username, String password) {}
}

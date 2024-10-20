package com.example.demo.mybatis.domain;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Member {
    private Long id;
    private String username;
    private String password;
    private Instant createdAt;
}

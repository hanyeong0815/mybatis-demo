create table if not exists member.member (
    id              BIGINT              AUTO_INCREMENT          PRIMARY KEY,
    username        VARCHAR(16)         NOT NULL,
    password        VARCHAR(255)        NOT NULL,
    created_at      DATETIME(6)         NOT NULL                DEFAULT CURRENT_TIMESTAMP(6)
);

CREATE INDEX idx ON `member`.member(username);
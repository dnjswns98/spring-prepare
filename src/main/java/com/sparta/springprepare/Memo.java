package com.sparta.springprepare;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Memo {
    private String username;
    private final String contents;
}
package com.serviciudad.portaltransaccional;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Auth{
    private final String login;
    private final String tranKey;
    private final String nonce;
    private final String seed;
}

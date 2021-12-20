package com.serviciudad.portaltransaccional;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class ClientRequest {
    private final String locale;
    private final Auth auth;
    private final Payment payment;
    private final String expiration;
    private final String returnUrl;
    private final String ipAddress;
    private final String userAgent;
}

package com.serviciudad.portaltransaccional;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class StatusError {
    private final String status;
    private final int reason;
    private final String message;
    private final String date;
}

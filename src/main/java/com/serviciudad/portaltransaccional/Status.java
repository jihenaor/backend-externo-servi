package com.serviciudad.portaltransaccional;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Status{
    private String status;
    private String reason;
    private String message;
    private String date;
}

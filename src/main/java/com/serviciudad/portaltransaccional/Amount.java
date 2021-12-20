package com.serviciudad.portaltransaccional;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Amount{
    private final String currency;
    private final long total;
}

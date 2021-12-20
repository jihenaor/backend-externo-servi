package com.serviciudad.portaltransaccional;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Payment{
    private final String reference;
    private final String description;
    private final Amount amount;
    private final boolean allowPartial;
}

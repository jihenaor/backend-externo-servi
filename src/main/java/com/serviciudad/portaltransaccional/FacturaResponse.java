package com.serviciudad.portaltransaccional;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class FacturaResponse {
    private Integer CodRespuesta;
    private String descripcion;
    private String idfactura;
    private String cuenta;
    private Integer tipofact;
    private Long totalfactura;
    private String fechapago;
}

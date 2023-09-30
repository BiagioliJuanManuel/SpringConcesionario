package com.multicapa.concesionario.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServicioVehiculo {
    private Date date;
    private int kilometers;
    private String descriptions;
}

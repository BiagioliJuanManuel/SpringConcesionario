package com.multicapa.concesionario.dto;

import com.multicapa.concesionario.entity.ServicioVehiculo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehiculoDto {
    private int id;
    private String brand;
    private String model;
    private LocalDate manufacturing;
    private Integer numberOfKilometers;
    private int doors;
    private Double price;

    private String currency;
    private List<ServicioVehiculo> services;
    private int countOfOwners;
}

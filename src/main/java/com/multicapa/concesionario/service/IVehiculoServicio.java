package com.multicapa.concesionario.service;

import com.multicapa.concesionario.dto.VehiculoDto;
import com.multicapa.concesionario.dto.response.ResponseDto;

import java.util.List;

public interface IVehiculoServicio {
    ResponseDto agregarVehiculo();

    List<VehiculoDto> obtenerTodos();

    List<VehiculoDto> filtrarFecha();

    List<VehiculoDto> filtrarPrecios();

    VehiculoDto buscarPorId();
}

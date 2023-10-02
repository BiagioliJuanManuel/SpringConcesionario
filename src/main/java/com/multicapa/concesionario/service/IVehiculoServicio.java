package com.multicapa.concesionario.service;

import com.multicapa.concesionario.dto.VehiculoDto;
import com.multicapa.concesionario.dto.response.ResponseDto;

import java.util.List;

public interface IVehiculoServicio {
    ResponseDto agregarVehiculo(VehiculoDto vehiculo);

    List<VehiculoDto> obtenerTodos();

    List<VehiculoDto> filtrarFecha(String since, String to);

    List<VehiculoDto> filtrarPrecios(int since, int to);

    VehiculoDto buscarPorId(int id);
}

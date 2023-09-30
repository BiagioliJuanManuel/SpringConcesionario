package com.multicapa.concesionario.service;

import com.multicapa.concesionario.dto.VehiculoDto;
import com.multicapa.concesionario.dto.response.ResponseDto;
import com.multicapa.concesionario.repository.IVehiculoRepository;
import com.multicapa.concesionario.repository.VehiculoRepositoryImp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoServicioImp implements IVehiculoServicio {

    private IVehiculoRepository repository;

    public VehiculoServicioImp(VehiculoRepositoryImp repository){
        this.repository = repository;
    }

    @Override
    public ResponseDto agregarVehiculo() {
        return null;
    }

    @Override
    public List<VehiculoDto> obtenerTodos() {
        return null;
    }

    @Override
    public List<VehiculoDto> filtrarFecha() {
        return null;
    }

    @Override
    public List<VehiculoDto> filtrarPrecios() {
        return null;
    }

    @Override
    public VehiculoDto buscarPorId() {
        return null;
    }
}

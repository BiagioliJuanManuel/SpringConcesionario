package com.multicapa.concesionario.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.multicapa.concesionario.dto.VehiculoDto;
import com.multicapa.concesionario.dto.response.ResponseDto;
import com.multicapa.concesionario.entity.Vehiculo;
import com.multicapa.concesionario.repository.IVehiculoRepository;
import com.multicapa.concesionario.repository.VehiculoRepositoryImp;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.util.List;

@Service
public class VehiculoServicioImp implements IVehiculoServicio {

    private IVehiculoRepository repository;
    private ObjectMapper mapper;

    public VehiculoServicioImp(VehiculoRepositoryImp repository){
        this.repository = repository;
        this.mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
    }




    @Override
    public ResponseDto agregarVehiculo(VehiculoDto vehiculo) {
//        mapper.registerModule(new JavaTimeModule());
           repository.agregarVehiculo( mapper.convertValue(vehiculo, Vehiculo.class) );

        return new ResponseDto("Vehiculo agregado satisfacctoriamente"+ vehiculo.toString());
    }

    @Override
    public List<VehiculoDto> obtenerTodos() {
//        mapper.registerModule(new JavaTimeModule());
        return repository.obtenerTodos().stream().map(vehiculo -> mapper.convertValue(vehiculo, VehiculoDto.class)).toList();

    }

    @Override
    public List<VehiculoDto> filtrarFecha(String since, String to) {
//        mapper.registerModule(new JavaTimeModule());
        return repository.filtrarFecha(since, to).stream().map(vehiculo -> mapper.convertValue(vehiculo, VehiculoDto.class)).toList();

    }

    @Override
    public List<VehiculoDto> filtrarPrecios(int since, int to) {
//        mapper.registerModule(new JavaTimeModule());
        return repository.filtrarPrecios(since, to).stream().map(vehiculo -> mapper.convertValue(vehiculo, VehiculoDto.class)).toList();

    }

    @Override
    public VehiculoDto buscarPorId(int id) {
//        mapper.registerModule(new JavaTimeModule());
        Vehiculo vehiculo = repository.buscarPorId(id);

        return mapper.convertValue(vehiculo, VehiculoDto.class);
    }
}

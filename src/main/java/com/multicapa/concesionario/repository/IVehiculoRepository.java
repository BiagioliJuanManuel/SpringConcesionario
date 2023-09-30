package com.multicapa.concesionario.repository;


import com.multicapa.concesionario.entity.Vehiculo;

import java.util.List;

public interface IVehiculoRepository {

    Vehiculo agregarVehiculo(Vehiculo vehiculo);
    List<Vehiculo> obtenerTodos();

    List<Vehiculo> filtrarFecha(String since, String to);
    List<Vehiculo> filtrarPrecios(int since, int to);

    Vehiculo buscarPorId();

}

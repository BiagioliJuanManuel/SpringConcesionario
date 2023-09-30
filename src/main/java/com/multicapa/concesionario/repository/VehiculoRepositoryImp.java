package com.multicapa.concesionario.repository;

import com.multicapa.concesionario.entity.Vehiculo;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class VehiculoRepositoryImp implements IVehiculoRepository{

    private List<Vehiculo> dataBase = new ArrayList<>();

    @Override
    public Vehiculo agregarVehiculo(Vehiculo vehiculo) {
        dataBase.add(vehiculo);
        return vehiculo;
    }

    @Override
    public List<Vehiculo> obtenerTodos() {
        return dataBase;
    }

    @Override
    public List<Vehiculo> filtrarFecha(String since, String to) {
        List<Vehiculo> respuesta = new ArrayList<>();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate desde = LocalDate.parse(since, formato);
        LocalDate hasta = LocalDate.parse(to, formato);
        for (Vehiculo vehiculo:dataBase) {
            if (vehiculo.getManufacturing().isAfter(desde) && vehiculo.getManufacturing().isBefore(hasta)){
                respuesta.add(vehiculo);
            }

        }

        return respuesta;
    }



/*
    @Override
    public List<Vehicle> findByManufacturingDate(String since, String to) {
        List<Vehicle> response = new ArrayList<>();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(1);
        if(since==null) {
            LocalDate fechaFin = LocalDate.parse(to, formato);
            for (Vehicle vehicle:vehicles) {
                if (vehicle.getManufacturingDate().isBefore(fechaFin)) {
                    response.add(vehicle);
*/
    @Override
    public List<Vehiculo> filtrarPrecios(int since,int to) {
        List<Vehiculo> respuesta = new ArrayList<>();

        for (Vehiculo vehiculo:dataBase) {
            if (vehiculo.getPrice()>= since && vehiculo.getPrice() <= to){
                respuesta.add(vehiculo);
            }

        }

        return respuesta;
    }

    @Override
    public Vehiculo buscarPorId() {
        return null;
    }
}

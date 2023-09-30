package com.multicapa.concesionario.controller;

import com.multicapa.concesionario.dto.VehiculoDto;
import com.multicapa.concesionario.service.IVehiculoServicio;
import com.multicapa.concesionario.service.VehiculoServicioImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/api/vehicles")
public class VehiculoController {

    private IVehiculoServicio service;

    public VehiculoController(VehiculoServicioImp service){
        this.service = service;
    }

    @PostMapping("/")
    public ResponseEntity<?> agregarVehiculo(@RequestBody VehiculoDto vehiculo){
        return new ResponseEntity<>(service.agregarVehiculo(), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<?> obtenerTodos(){
        return new ResponseEntity<>(service.obtenerTodos(), HttpStatus.OK);
    }

    @GetMapping("/dates")
    public ResponseEntity<?> entreFechas(@RequestParam String since, @RequestParam String to){
        return new ResponseEntity<>(service.filtrarFecha(), HttpStatus.OK);
    }

    @GetMapping("/prices")
    public ResponseEntity<?> entrePrecios(@RequestParam int since, @RequestParam int to){
        return new ResponseEntity<>(service.filtrarPrecios(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarID(@PathVariable int id){
        return new ResponseEntity<>(service.buscarPorId(), HttpStatus.OK);
    }

//    @GetMapping("/dates/{since}/{to}")
//    public ResponseEntity<?> getByManufacturingDate(@PathVariable String since, @PathVariable String to){
//        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate fechaInicio = LocalDate.parse(since, formato);
//        LocalDate fechaFin = LocalDate.parse(to, formato);
//        System.out.println(fechaInicio+"  "+fechaFin);
//        return  new ResponseEntity<>(service.getByManufacturingDate(fechaInicio,fechaFin),HttpStatus.
//

}

package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CarroModel;
import com.example.demo.service.CarroService;

@RestController
@RequestMapping("/carros")
public class CarroController {    
    private final CarroService carroService;

    public CarroController(CarroService carroService){
        this.carroService = carroService;
    }

    @GetMapping
    public List<CarroModel> listar(){
        return carroService.listarTodos();
    }

    @PostMapping
    public CarroModel criar(@RequestBody CarroModel carro){
        return carroService.salvar(carro);
    }
}
